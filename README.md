Apache Axis2 demo
==========
This is Apache Axis2 Demo Project.

If you want to build this project, please follow the next step.
1, checkout out parent and run: 
    git clone git@github.com:bulain/parent.git
    mvn install
2, checkout out axis2-demo:
    git clone git@github.com:bulain/axis2-demo.git
    mvn eclipse:eclipse
    
Server side Task:
1. Deploying POJOs
2. Building the service using AXIOM
3. Generating the service using ADB
4. Generating the service using XMLBeans
5. Generating the service using JiBX

Client side Task:
1. Creating a client using AXIOM
2. Generating a client using ADB
3. Generating a client using XML Beans
4. Generating a client using JiBX

DemoService
http://localhost:8082/axis2-demo/services/DemoService?wsld
http://localhost:8082/axis2-demo/services/DemoService/emerge
http://localhost:8082/axis2-demo/services/DemoService?emerge

DemoServiceHandler
http://localhost:8082/axis2-demo/services/DemoServiceHandler?wsdl
http://localhost:8082/axis2-demo/services/DemoServiceHandler/getValue
http://localhost:8082/axis2-demo/services/DemoServiceHandler?getValue

Jibx
mvn jibx:schema-codegen -Pjibx
mvn jibx:bind -Pjibx
