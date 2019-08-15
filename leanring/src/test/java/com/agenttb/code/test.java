package com.agenttb.code;

import com.agenttb.code.designpattern.LRUCache;
import org.junit.Test;

import java.time.LocalDate;

public class test {

    @Test
    public void testLocalDate() {
        LocalDate localDate = LocalDate.of(2018, 10, 24);
        System.out.println(localDate);
    }

    @Test
    public void testFloatNumberPlus() {
        float a = 0.1f;
        float b = 0;
        double c = 0;
        System.out.println(a + b);
        for (int i  = 0; i < 10; i++) {
            b += a;
        }
        for (int j = 0; j < 10; j++) {
            c += a;
        }
        System.out.println(b);
        System.out.println(c);
    }

    @Test
    public void testLRUCache() {
        LRUCache<Integer, String> lruCache = new LRUCache<>(5);
        for (int i = 0; i < 10; i++) {
            lruCache.put(i, "tianbin" + i);
        }
        lruCache.display().forEach( v -> System.out.println(v.getKey() + "--" + v.getValue()));
    }
}
