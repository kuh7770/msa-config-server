package com.kasha.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MsaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsaApplication.class, args);
    }

}
