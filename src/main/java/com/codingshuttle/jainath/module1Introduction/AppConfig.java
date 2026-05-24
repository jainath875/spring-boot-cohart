package com.codingshuttle.jainath.module1Introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    PaymentService paymentService() {
        //we can define some more logic by using this method
        return new PaymentService();
    }
}
