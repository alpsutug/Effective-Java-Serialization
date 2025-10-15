package com.serialization.effectivejavaserialization.Item85_Item86;

import java.io.Serializable;

public class User implements Serializable {

    //Eğer serialVersionUID vermezsek de doğru çalışır
    //fakat sistem kendi yapısında göre kriptografik karama işlemiyle kendi
    // otomatik üretir bu da maliyeti artırır
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User = [ id: " + id + ", name: " + name + " ]" ;
    }
}

