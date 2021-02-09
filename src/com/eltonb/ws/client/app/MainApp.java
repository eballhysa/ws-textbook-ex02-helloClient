/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonb.ws.client.app;

import com.eltonb.ws.client.model.HelloRequest;
import com.eltonb.ws.client.model.HelloResponse;
import com.eltonb.ws.client.model.HelloService;
import com.eltonb.ws.client.model.HelloService_Service;

/**
 *
 * @author elton.ballhysa
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.go();
    }

    private void go() {
        HelloService_Service service = new HelloService_Service();
        HelloService port = service.getHelloServicePort();
        System.out.println(port.echo("javaworld"));
        System.out.println("-------------");
        HelloRequest request = new HelloRequest();
        request.setName("Java");
        request.setSurname("Duke");
        HelloResponse response = port.greet(request);
        System.out.println(response.getDate());
        System.out.println(response.getGreeting());
    }
    
}
