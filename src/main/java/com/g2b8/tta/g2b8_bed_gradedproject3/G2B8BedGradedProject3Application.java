package com.g2b8.tta.g2b8_bed_gradedproject3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}) //, UserDetailsServiceAutoConfiguration.class})

public class G2B8BedGradedProject3Application {

    public static void main(String[] args) {
        SpringApplication.run(G2B8BedGradedProject3Application.class, args);
    }

}
