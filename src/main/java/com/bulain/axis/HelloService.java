package com.bulain.axis;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface HelloService {
    @WebMethod
    String say(@WebParam(name = "hello") String hello);

    @WebMethod
    @WebResult(name = "response")
    Hello handle(@WebParam(name = "request") String request);
    
    @WebMethod
    @WebResult(name = "response")
    Hello hand(@WebParam(name = "request") Hello hello);
}
