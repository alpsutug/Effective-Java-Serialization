package com.serialization.effectivejavaserialization.Item88_Item89.Item50;

import java.util.Date;

public class Attacks {

    public static void main(String[] args) {


        // Attack the internals of a Period instance (Page 232)
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        end.setYear(78); // Modifies internals of p!
        System.out.println(p);


    }

}
