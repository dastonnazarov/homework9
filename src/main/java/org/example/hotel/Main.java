package org.example.hotel;

import org.example.hotel.config.Config;
import org.example.hotel.controller.AdminController;
import org.example.hotel.db.Database;
import org.example.hotel.repository.BookingRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

Database.initAdmins();
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
//        AdminController adminController = (AdminController) applicationContext.getBean("adminController");
//        adminController.start();

//        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//        SessionFactory factory = meta.getSessionFactoryBuilder().build();
//
//        Session session = factory.openSession();
//        Transaction transaction = session.beginTransaction();




    }
}
