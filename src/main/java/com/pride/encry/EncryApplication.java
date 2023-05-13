package com.pride.encry;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableEncryptableProperties
@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})
public class EncryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EncryApplication.class, args);
    }

}
