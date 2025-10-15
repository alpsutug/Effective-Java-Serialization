package com.serialization.effectivejavaserialization.Item85_Item86;

import java.io.*;

public class SerializationMain {
    public static void main(String[] args) throws IOException {

        // Kullanıcı Oluşturuyoruz

        User user = new User();
        user.setId(1);
        user.setName("Alpsu");

        // Dosyanın kayıt edileceği pathi veriyoruz

        String filePath = "//Users/macbook/Documents/Effective-Java-Serialization/src/main/java/com/serialization/effectivejavaserialization/Item85_Item86/user.txt";

        // Yazma işlemini yapıyoruz

        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);



        // Okuma işlemini yapıyoruz
        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User deserializedUser = null; // amaç değer vermek try içinde tanımlasaydık dışardan erişilemezdi

        try
        {
            deserializedUser=(User) objectInputStream.readObject();
            System.out.println(deserializedUser.toString());

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

