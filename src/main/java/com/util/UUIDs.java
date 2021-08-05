package com.util;

import java.util.UUID;

public class UUIDs {

    public static String getUUID(){
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString().replace("-","");

        return id;

    }

}
