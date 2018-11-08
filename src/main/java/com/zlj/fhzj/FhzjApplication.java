package com.zlj.fhzj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class FhzjApplication {

    public static void main(String[] args) {
        SpringApplication.run(FhzjApplication.class, args);
    }
}
