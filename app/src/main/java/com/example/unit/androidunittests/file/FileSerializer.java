package com.example.unit.androidunittests.file;

import com.example.unit.androidunittests.Item;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Serializes an Item to a file.
 */
public class FileSerializer {

    public void save(File file, Item item) throws Exception {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(item);
        os.close();
        fos.close();
    }

    public Item load(File file) throws Exception {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream is = new ObjectInputStream(fis);
        Item item = (Item) is.readObject();
        is.close();
        fis.close();
        return item;
    }
}