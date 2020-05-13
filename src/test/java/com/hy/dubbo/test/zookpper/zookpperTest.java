package com.hy.dubbo.test.zookpper;

import org.apache.zookeeper.*;

import org.apache.zookeeper.data.Stat;
import org.junit.Test;

import java.io.IOException;

public class zookpperTest {

    @Test
    public void connect() throws IOException, KeeperException, InterruptedException {
        ZooKeeper zooKeeper = new ZooKeeper("127.0.0.1:2181",3000,null);
        /*zooKeeper.create("/testRoot", "testRoot".getBytes(),
                ZooDefs.Ids.OPEN_ACL_UNSAFE,
                CreateMode.PERSISTENT);*/
        Stat stat = new Stat();
        byte[] data = zooKeeper.getData("/testRoot", true, stat);
        System.out.println(new String(data));
    }

}
