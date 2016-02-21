package com.example.unit.androidunittests.json;

import android.test.suitebuilder.annotation.SmallTest;

import com.example.unit.androidunittests.Item;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test for a json parser. It uses org.json classes from the Android SDK
 */
@SmallTest
public class JsonParserTest {

    @Test
    public void serialize_deserialize() throws Exception {
        JsonParser jsonParser = new JsonParser();
        Item item = new Item("myKey", true);

        String s = jsonParser.serialize(item);
        Item item2 = jsonParser.deserialize(s);

        // Verify that the received data is correct.
        assertEquals(item, item2);
    }
}
