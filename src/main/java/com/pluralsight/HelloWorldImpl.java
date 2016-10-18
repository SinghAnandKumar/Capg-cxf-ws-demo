
package com.pluralsight;

import javax.jws.WebService;

@WebService(endpointInterface = "com.pluralsight.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

