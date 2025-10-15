package com.serialization.effectivejavaserialization.Item87;

import java.io.*;

public class MyExampleMain {
    public static void main(String[] args) throws IOException {

        MyExample myExample = new MyExample();
        myExample.setName("alpsu");
        myExample.setPassword("gib06");
        myExample.setGeciciDeger("bos");

        String filePath = "//Users/macbook/Documents/Effective-Java-Serialization/src/main/java/com/serialization/effectivejavaserialization/Item87/myExample.txt";

        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(myExample);
        //kapatıldığından emin olmak için

        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        MyExample myExampleDeser = null; // neden araştır

        try
        {
            myExampleDeser = (MyExample) objectInputStream.readObject();
            System.out.println(myExampleDeser.toString());
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    }
