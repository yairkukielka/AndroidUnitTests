package com.example.unit.androidunittests;

import java.io.Serializable;

public class Item implements Serializable {

    private String key;
    private boolean value;

    public Item(String key, boolean value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public boolean isValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (value != item.value) return false;
        return !(key != null ? !key.equals(item.key) : item.key != null);

    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value ? 1 : 0);
        return result;
    }
}
