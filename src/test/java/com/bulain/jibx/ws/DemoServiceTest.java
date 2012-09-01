package com.bulain.jibx.ws;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.junit.Before;
import org.junit.Test;

import com.bulain.jibx.pojo.Demo;

public class DemoServiceTest {
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
