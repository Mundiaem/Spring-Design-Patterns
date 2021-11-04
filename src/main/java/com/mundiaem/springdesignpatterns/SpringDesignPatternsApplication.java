package com.mundiaem.springdesignpatterns;

import com.mundiaem.springdesignpatterns.prototype.ProtoFalse;
import com.mundiaem.springdesignpatterns.prototype.ProtoTrue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mundiaem.springdesignpatterns.factory", "com.mundiaem.springdesignpatterns.configuration", "com.mundiaem.springdesignpatterns.controller", "com.mundiaem.springdesignpatterns.singleton"})
@AutoConfigurationPackage
public class SpringDesignPatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDesignPatternsApplication.class, args);
    }

    @Bean
    public ProtoFalse protoFalse() {
        return new ProtoFalse();
    }

    @Bean
    @Scope("prototype")
    public ProtoTrue protoTrue() {
        return new ProtoTrue();
    }

}
