package com.bulain.axis2.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.rmi.RemoteException;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.bulain.axis2.pojo._1_0.Demo;
import com.bulain.axis2.service.demo.DemoServiceStub;

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners(value = {DependencyInjectionTestExecutionListener.class})
@ContextConfiguration(locations = {"classpath:spring/applicationContext-resource.xml",
        "classpath:spring/applicationContext-client.xml"})
public class DemoServiceClient {
    private static ConfigurationContext ctx;
    private DemoServiceStub stub;

    @BeforeClass
    public static void setUpClass() throws IOException {
        ClassPathResource resource = new ClassPathResource("axis_client.xml");
        String xml = resource.getFile().getAbsolutePath();
        ctx = ConfigurationContextFactory.createConfigurationContextFromFileSystem("target/axis2-demo/WEB-INF", xml);
    }

    @Before
    public void setUp() throws IOException {
        stub = new DemoServiceStub(ctx, "http://localhost:8083/axis2-demo/services/DemoService");
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
