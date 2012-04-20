package com.bulain.axis.demo;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.OMText;

public class DemoServiceHandler {
    private DemoService demoService;

    // The web service
    public OMElement getValue(OMElement ignore) {
        OMFactory factory = OMAbstractFactory.getOMFactory();
        OMNamespace payloadNs = factory.createOMNamespace("http://springExample.org/example1", "example1");
        OMElement payload = factory.createOMElement("string", payloadNs);
        OMText response = factory.createOMText(demoService.emerge());
        payload.addChild(response);
        return payload;
    }

    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }
    
}
