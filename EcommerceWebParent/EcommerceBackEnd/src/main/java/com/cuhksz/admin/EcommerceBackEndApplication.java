package com.cuhksz.admin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
// Check the test page at http://localhost:8080/EcommerceAdmin/
public class EcommerceBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceBackEndApplication.class, args);
    }
}
