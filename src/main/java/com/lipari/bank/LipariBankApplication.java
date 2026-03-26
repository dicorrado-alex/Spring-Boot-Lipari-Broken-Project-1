package com.lipari.bank;

import com.lipari.bank.shared.config.LipariBankProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

// Attivato caricamento proprietà per LipariBankProperties
// commento
@EnableConfigurationProperties(LipariBankProperties.class)
@SpringBootApplication
public class LipariBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(LipariBankApplication.class, args);
    }
}
