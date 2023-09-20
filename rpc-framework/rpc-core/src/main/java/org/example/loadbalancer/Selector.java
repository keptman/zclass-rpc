package org.example.loadbalancer;

import java.net.InetSocketAddress;

/**
 * @author keptman
 * @createTime 2023-07-06
 */
public interface Selector {

    /**
     * 根据服务列表执行一种算法获取一个服务节点
     * @return 具体的服务节点
     */
    InetSocketAddress getNext();

}
