package com.serialization.effectivejavaserialization.Item85_Item86;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserJson {
    public static void main(String[] args) throws JsonGenerationException, JsonMappingException,IOException {

        User user = new User();
        user.setId(1);
        user.setName("Alpsu");

        String filePath = "//Users/macbook/Documents/Effective-Java-Serialization/src/main/java/com/serialization/effectivejavaserialization/Item85_Item86/user.json";

        File file = new File(filePath);
        ObjectMapper mapper = new ObjectMapper();

        // JSON'a yaz
        mapper.writeValue(file, user);

        // JSON'dan geri oku
        User deserializedUser = mapper.readValue(new File(filePath), User.class);
        System.out.println(deserializedUser.toString());
    }
}

