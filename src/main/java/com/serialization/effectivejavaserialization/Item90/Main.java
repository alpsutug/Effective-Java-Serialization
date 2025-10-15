package com.serialization.effectivejavaserialization.Item90;


import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        TruePerson tp = new TruePerson("Alpsu", 25);

        String filePath = "D:\\FS\\Learning\\E book\\effective-java\\src\\main\\java\\com\\effectivejava\\tutorial\\effectivejava\\itema90\\TruePerson.txt";

        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(tp);

        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        TruePerson myExampleDeser = null;

        try {
            myExampleDeser = (TruePerson) objectInputStream.readObject();
            System.out.println(myExampleDeser.toString());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}