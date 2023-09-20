package org.example.impl;

import org.example.HelloRpc;

public class HelloRpcImpl implements HelloRpc {
    @Override
    public String sayHi(String msg) {
        return "hi consumer:"+msg;
    }
}
