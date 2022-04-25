package com.cuhksz.admin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EcommerceBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceBackEndApplication.class, args);
    }
}
