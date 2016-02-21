package com.example.unit.androidunittests.file;

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import com.example.unit.androidunittests.Item;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;

import java.io.File;

import static org.junit.Assert.assertEquals;

/**
 * Tests that the saves an object to a file.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class FileSerializerTest {

    /**
     * This folder is created in the setup and deleted in the tear down method (implicitly by this rule)
     * In Android, it uses the context.getCacheDir() directory
     */
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void save_and_load_file() throws Exception {
        FileSerializer serializer = new FileSerializer();
        File myFile = folder.newFile("myfile.txt");
        Item item1 = new Item("myKey", true);

        serializer.save(myFile, item1);
        Item item2 = serializer.load(myFile);

        // Verify that the received data is correct.
        assertEquals(item1, item2);
    }
}
