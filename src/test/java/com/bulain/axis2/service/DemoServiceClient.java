package com.bulain.axis2.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.junit.Before;
import org.junit.Test;

import com.bulain.axis2.pojo._1_0.Demo;
import com.bulain.axis2.service.demo.DemoServiceStub;

public class DemoServiceClient {
    private DemoServiceStub stub;

    @Before
    public void setUp() throws AxisFault {
        stub = new DemoServiceStub("http://localhost:8082/axis2-demo/services/DemoService");
    }

    @Test
    public void testTest01() throws RemoteException {
        String response = stub.test01("request59");
        assertEquals("request59", response);
    }

    @Test
    public void testTest02() throws RemoteException {
        Demo request = new Demo();
        request.setRequest("param");
        Demo response = stub.test02(request);
        assertNotNull(response);
    }

}
