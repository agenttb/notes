package com.agenttb.code.redis;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

public class RedisCluster {
    public static void main(String[] args) {
        Set<HostAndPort> jedisClusterNodes = new HashSet<>();
        jedisClusterNodes.add(new HostAndPort("127.0.0.1", 30001));
        jedisClusterNodes.add(new HostAndPort("127.0.0.1", 30002));
        jedisClusterNodes.add(new HostAndPort("127.0.0.1", 30003));

        JedisCluster jedisCluster = new JedisCluster(jedisClusterNodes);
        jedisCluster.set("foob", "bar");
        String foob = jedisCluster.get("foob");
        System.out.println(foob);
    }
}
