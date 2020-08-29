package com.agenttb.code.designpattern;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<T, V> {
    private LRULinkedHashMap<T, V> cache = new LRULinkedHashMap<>();
    private  final int MAX_SIZE;

    public LRUCache(int capacity) {
        this.MAX_SIZE = capacity;
    }
    public V get(T key) {
        return cache.get(key);
    }

    public V put(T key, V value) {
        return cache.put(key, value);
    }

    public ArrayList<Map.Entry<T, V>> display() {
        return new ArrayList<>(cache.entrySet());
    }

    class LRULinkedHashMap<T, V> extends LinkedHashMap<T, V> {
        @Override
        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size() > MAX_SIZE;
        }
    }
}
