/*
 * Copyright 2015 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.unit.androidunittests.json;

import com.example.unit.androidunittests.Item;

import org.json.JSONObject;

/**
 * Json parser.
 */
public class JsonParser {

    public static final String KEY_TAG = "key";
    public static final String VALUE_TAG = "value";

    public String serialize(Item item) throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(KEY_TAG, item.getKey());
        jsonObject.put(VALUE_TAG, item.isValue());
        return jsonObject.toString();
    }

    public Item deserialize(String s) throws Exception {
        JSONObject jsonObject = new JSONObject(s);
        return new Item(jsonObject.getString(KEY_TAG), jsonObject.getBoolean(VALUE_TAG));
    }


}