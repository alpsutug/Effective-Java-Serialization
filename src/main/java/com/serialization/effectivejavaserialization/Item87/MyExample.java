package com.serialization.effectivejavaserialization.Item87;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyExample implements Serializable {

    private static final long serialVersionUID = 1234567891234567891L;
    private String name;
    private String password;

    //geçici,uçucu
    private transient String geciciDeger ;
   // private transient static String gecici="a";  static veya final olunca transient değerinin değeri kalmıyor direk yazdırıyor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGeciciDeger() {
        return geciciDeger;
    }

    public void setGeciciDeger(String geciciDeger) {
        this.geciciDeger = geciciDeger;
    }

    //manipüle etmek istendiğinde writeObject ve readObject el ile yazılır
    private void writeObject(ObjectOutputStream oos) throws IOException {
        String userName=name;
        String encryptedPassword = password + " salt";
        oos.writeObject(userName);
        oos.writeObject(encryptedPassword);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        name = (String) ois.readObject();
        password = (String) ois.readObject();
       // password = password.replace(" salt", "");
    }

    @Override
    public String toString() {
        return "MyExample{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gecici='" + geciciDeger + '\'' +
                '}';
    }
}
