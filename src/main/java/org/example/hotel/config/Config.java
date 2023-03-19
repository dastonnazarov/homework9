package org.example.hotel.config;


import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.security.sasl.SaslServerFactory;

@Configuration
@ComponentScan(basePackages = "org.example.hotel")
public class Config {
    @Bean
    public SessionFactory sessionFactory() {
        StandardServiceRegistry sSF = new StandardServiceRegistryBuilder().configure("hibernate.cnf.xml").build();
        Metadata metadata = new MetadataSources(sSF).getMetadataBuilder().build();
        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        return factory;


    }
}
