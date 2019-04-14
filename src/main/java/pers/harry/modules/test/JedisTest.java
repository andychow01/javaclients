package pers.harry.modules.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import org.junit.Test;


public class JedisTest {
    private static JedisPool jedisPool = null;
    @Test
    public void simpleGet() {
        Jedis jedis = new Jedis("192.168.152.128", 6379);  //指定Redis服务Host和port
        //jedis.auth("xxxx"); //如果Redis服务连接需要密码，输入密码
        String value = jedis.get("one"); //访问Redis服务
        System.out.println("key:one " + value);
        jedis.close(); //使用完关闭连接
    }

    @Test
    public void poolGet() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(8);
        config.setMaxTotal(18);
        JedisPool pool = new JedisPool(config, "192.168.152.128", 6379, 2000);
        Jedis jedis = pool.getResource();
        String value = jedis.get("one");
        System.out.println("key:one " + value);
        jedis.close();
        pool.close();
    }
}
