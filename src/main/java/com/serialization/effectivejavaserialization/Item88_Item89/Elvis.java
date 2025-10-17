package com.serialization.effectivejavaserialization.Item88_Item89;

import java.io.Serializable;
import java.util.Arrays;

public class Elvis implements Serializable {

    /**
     *
     */
      private static final long serialVersionUID = 1L;
      public static final Elvis INSTANCE = new Elvis(); //singleton dışardan newlenemeyen bir sınıf çünkü constructor private ve INSTANCE

    private Elvis() {
    }

    private transient String[] favoriteSongs = { "Hound Dog", "Heartbreak Hotel" };

    public void printFavorites() {
        System.out.println(Arrays.toString(favoriteSongs));
    }

    // bunu kapatırsan not kapatmazsan - olur ve güvenlik açıklarından kurtulurz
    private Object readResolve() {
        return INSTANCE;
    }

}