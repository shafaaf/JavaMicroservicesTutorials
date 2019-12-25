package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {
        System.out.println("Hi");

        Alien alien = new Alien();
        alien.setAid(101);
        alien.setAname("Shafaaf");
        alien.setColor("Green");

        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        //String hibernatePropsFilePath = "hibernate.cfg.xml";
        Configuration conn = new Configuration()
                .configure()
                .addAnnotatedClass(Alien.class);


        SessionFactory factory = conn.buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
        session.save(alien);
        tx.commit();
    }
}
