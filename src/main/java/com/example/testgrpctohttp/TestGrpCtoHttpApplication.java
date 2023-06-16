package com.example.testgrpctohttp;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestGrpCtoHttpApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TestGrpCtoHttpApplication.class, args);
        Server server = ServerBuilder.forPort(8899).addService(new RPCDateServiceImpl()).build().start();
        server.awaitTermination();
    }
}
