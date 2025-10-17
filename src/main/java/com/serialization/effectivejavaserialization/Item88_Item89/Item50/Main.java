package com.serialization.effectivejavaserialization.Item88_Item89.Item50;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // immutable
		String isim = "alpsu";
		System.out.println(isim.toUpperCase());
		System.out.println(isim);

        // Date
        Date tarih = new Date();
        System.out.println(tarih);
        tarih.setYear(1234);
        System.out.println(tarih);

    }

}