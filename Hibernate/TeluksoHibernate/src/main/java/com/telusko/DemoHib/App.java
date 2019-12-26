package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {

    public static void main(String[] args) {
        System.out.println("Hi");

        Alien alien = new Alien();
        alien.setAid(101);
        alien.setAname("Shafaaf");
        alien.setColor("Green");

        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        Configuration conf = new Configuration();

        conf.configure().addAnnotatedClass(Alien.class);

        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
                .applySettings(conf.getProperties())
                .buildServiceRegistry();

        SessionFactory sf = conf.buildSessionFactory(serviceRegistry);
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.save(alien);
        tx.commit();
    }
}
