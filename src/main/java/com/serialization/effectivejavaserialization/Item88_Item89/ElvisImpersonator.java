package com.serialization.effectivejavaserialization.Item88_Item89;

import java.io.*;

public class ElvisImpersonator {


    private static final byte[] serializedFormByMe = {-84, -19, 0, 5, 115, 114, 0, 64, 99, 111, 109, 46, 115, 101, 114, 105,
            97, 108, 105, 122, 97, 116, 105, 111, 110, 46, 101, 102, 102, 101, 99, 116,
            105, 118, 101, 106, 97, 118, 97, 115, 101, 114, 105, 97, 108, 105, 122, 97,
            116, 105, 111, 110, 46, 73, 116, 101, 109, 56, 56, 95, 73, 116, 101, 109,
            56, 57, 46, 69, 108, 118, 105, 115, 8, 97, -1, -29, -46, -85, -115, 86,
            2, 0, 0, 120, 112};

    public static Object deserialize(byte[] bytes) {
        try {
            return new ObjectInputStream(new ByteArrayInputStream(bytes)).readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void main(String[] args) {
        // Initializes ElvisStealer.impersonator and returns
        // the real Elvis (which is Elvis.INSTANCE)
        Elvis elvis = (Elvis) deserialize(serializedFormByMe);
        elvis.printFavorites();

    }


}