package org.example;


import lombok.extern.slf4j.Slf4j;
import org.apache.zookeeper.*;
import org.example.exceptions.ZookeeperException;
import org.example.utils.zookeeper.ZookeeperNode;
import org.example.utils.zookeeper.ZookeeperUtil;

import java.io.IOException;
import java.util.List;

/**
 * 注册中新管理页面
 */

@Slf4j
public class Application {
    public static void main(String[] args) throws IOException {


            //创建一个zookeeper实例
            ZooKeeper zooKeeper = ZookeeperUtil.createZookeeper();
            //定义节点和数据
            String basePath = "/rpc-metadata";
            String providerPath = basePath+ "/providers";
            String consumersPath = basePath+ "/consumers";

            ZookeeperNode baseNode = new ZookeeperNode(basePath,null);
            ZookeeperNode providersNode = new ZookeeperNode(providerPath,null);
            ZookeeperNode consumersNode = new ZookeeperNode(consumersPath ,null);

            //创建节点
            List.of(baseNode,providersNode,consumersNode).forEach(node->{
              ZookeeperUtil.createNode(zooKeeper,node,null,CreateMode.PERSISTENT);
            });

            //关闭连接
            ZookeeperUtil.close(zooKeeper);

    }

}

