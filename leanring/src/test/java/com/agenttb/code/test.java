package com.agenttb.code;

import org.junit.Test;

import java.util.UUID;

public class test {
    @Test
    public void printUUID() {
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        System.out.println(uuid.length());
    }
}
