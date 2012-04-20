package com.bulain.axis.demo;

public class DemoServiceImpl implements DemoService {
	private String str = null;
    // spring 'injects' this value
    public void setVal(String s) {
        str = s;
    }
    // web service gets this value
    public String emerge() {
        return str;
    }
}
