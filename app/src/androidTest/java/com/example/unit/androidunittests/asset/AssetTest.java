package com.example.unit.androidunittests.asset;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.test.suitebuilder.annotation.SmallTest;

import com.example.unit.androidunittests.Utils;

import org.junit.Test;

import java.io.InputStream;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Instrumented test that reads a local asset.
 */
@SmallTest
public class AssetTest {

    @Test
    public void readAppAsset() throws Exception {
        Context ctx = InstrumentationRegistry.getTargetContext();
        InputStream is = ctx.getResources().getAssets().open("myasset.txt");
        String s = Utils.readTextStream(is);
        assertEquals("main myAsset", s);
    }

    @Test
    public void readTestAsset() throws Exception {
        Context ctx = InstrumentationRegistry.getContext();
        InputStream is = ctx.getResources().getAssets().open("myasset.txt");
        String s = Utils.readTextStream(is);
        assertEquals("androidTest myAsset", s);
    }

}
