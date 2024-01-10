package com.example.vibedrive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class VibeDriveApplication {
    public static void main(String[] args) {
        SpringApplication.run(VibeDriveApplication.class, args);
    }

}
