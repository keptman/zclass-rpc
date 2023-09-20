package org.example;

import org.example.discovery.RegistryConfig;

public class ConsumerApplication {
    public static void main(String[] args) {
        // 想尽一切办法获取代理对象 使用ReferenceConfig镜像封装
        // reference 当中一定有生成代理的模板方法，get()
        ReferenceConfig<HelloRpc> reference = new ReferenceConfig<>();
        reference.setInterface(HelloRpc.class);


        // 代理做了些什么，
        // 1 链接注册中心
        // 2.拉取服务列表
        // 3 选择一个服务并建立一个链接
        // 4 发送请求，卸载一些信息（接口名，参数列表，方法的名字）获得结果
        ZrpcBootstrap.getInstance()
                .application("first-zrpc-consumer")
                .registry(new RegistryConfig("zookeeper://127.0.0.1:2181" ))
                .reference(reference);


        // 获取一个代理对象
        HelloRpc helloRpc = reference.get();
        helloRpc.sayHi("你好");
    }
}
