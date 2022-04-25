package com.Ecommerce.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
// Check the test page at http://localhost/Ecommerce/
public class EcommerceFrontEndApplication {
    public static void main(String[] args) {
        SpringApplication.run(EcommerceFrontEndApplication.class, args);
    }
}
