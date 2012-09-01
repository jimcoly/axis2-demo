package com.bulain.jibx.service;

import com.bulain.jibx.pojo.Demo;
import com.bulain.jibx.ws.DemoServiceSkeletonInterface;

public class DemoServiceImpl implements DemoServiceSkeletonInterface {

    public String test01(String request) {
        return request;
    }

    public Demo test02(Demo request) {
        return request;
    }

}
