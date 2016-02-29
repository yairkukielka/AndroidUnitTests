package com.example.unit.androidunittests.asset;

import android.test.suitebuilder.annotation.SmallTest;

import com.example.unit.androidunittests.Utils;

import org.junit.Test;

import java.io.InputStream;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Non-instrumented test that reads a local text file.
 */
@SmallTest
public class AssetTest {

    /**
     * This test will read the content of the src/test/resources/myasset.txt file if it exists.
     * Otherwise it will read the content of  src/main/resources/myasset.txt if it exists and
     * the next line is present in the build.gradle file: sourceSets.test.resources.srcDirs += ["src/main"]     *
     *
     * @throws Exception
     */
    @Test
    public void readTestFile() throws Exception {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("myasset.txt");
        String s = Utils.readTextStream(inputStream);
        assertThat(s, notNullValue());
    }

    /**
     * This test will read the content of the src/main/assets/myasset.txt file. For this to work you need
     * this in the build.gradle (which is added in this project):
     * sourceSets.test.resources.srcDirs += ["src/main"]
     *
     * @throws Exception
     */
    @Test
    public void readAppFile() throws Exception {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("myasset.txt");
        String s = Utils.readTextStream(inputStream);
        assertThat(s, notNullValue());
    }

    /**
     * This test will the content of the src/test/myfiles/myfile.txt file. For this to work you need
     * this in the build.gradle (which is added in this project):
     * sourceSets.test.resources.srcDirs += ["src/test/myfiles"]
     *
     * @throws Exception
     */
    @Test
    public void readTestMyFile() throws Exception {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("myfile.txt");
        String s = Utils.readTextStream(inputStream);
        assertEquals("test myfiles", s);
    }
}
