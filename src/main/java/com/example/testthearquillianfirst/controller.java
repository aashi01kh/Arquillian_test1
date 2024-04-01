package com.example.testthearquillianfirst;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.io.PrintStream;



@RestController

public class controller {

    @Path("/hello")
    @GET
    public  String  get() {
        return "Hello";
    }

    public void greet(PrintStream to, String name) {
        to.println(createGreeting(name));
    }

    public String createGreeting(String name) {
        return "Hello, " + name + "!";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "String Boot docker demo";
    }


}
