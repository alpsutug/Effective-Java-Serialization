package com.serialization.effectivejavaserialization.Item88_Item89;


import java.io.*;


public class MakeElvisBytes {

    public static void main(String[] args) throws Exception {
        byte[] bytes = serializeElvis();
        printAsJavaLiteral(bytes);   // Konsola Java literal'ı basar
    }

    static byte[] serializeElvis() {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream out = new ObjectOutputStream(bos)) {
            out.writeObject(Elvis.INSTANCE);   // <-- SENİN Elvis’in (Item88_Item89 paketinde)
            out.flush();
            return bos.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void printAsJavaLiteral(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        sb.append("private static final byte[] serializedFormByMe = {");
        for (int i = 0; i < bytes.length; i++) {
            sb.append(bytes[i]);
            if (i < bytes.length - 1) sb.append(", ");
            if ((i % 16) == 15) sb.append("\n    ");
        }
        sb.append("};");
        System.out.println(sb);
    }
}
