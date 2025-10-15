package com.serialization.effectivejavaserialization.Item88_Item89;

import java.io.Serializable;
import java.util.Arrays;

public class Elvis implements Serializable {

    private static final long serialVersionUID = 604045179001474390L;

    public static final Elvis INSTANCE = new Elvis(); //singleton dışardan newlenemeyen bir sınıf

    private Elvis() {

    }

    private transient String [] favoriteSongs = {"Hound Dog","Heartbreak Hotel"};

    public void printFavorites() {
        System.out.println(Arrays.toString(favoriteSongs));

    }

    // bunu kapatırsan not kapatmazsan - olur ve güvenlik açıklarından kurtulurz

    private Object readResolve() {
        return INSTANCE;
    }
}
