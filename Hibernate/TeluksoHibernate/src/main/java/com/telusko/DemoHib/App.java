package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {

    private static void BasicExample1() {

        System.out.println("==BasicExample1==");

        AlienName aname = new AlienName (
                "Shafaaf",
                "Khaled",
                "Hossain"
        );

        Alien toSaveAlien = new Alien();
        toSaveAlien.setAid(101);
        toSaveAlien.setAname(aname);
        toSaveAlien.setColor("Green");

        Configuration conf = new Configuration();
        conf.configure().addAnnotatedClass(Alien.class);
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
                .applySettings(conf.getProperties())
                .buildServiceRegistry();

        SessionFactory sf = conf.buildSessionFactory(serviceRegistry);
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.save(toSaveAlien);
        System.out.println("Saving to db: " + toSaveAlien);
        tx.commit();


        Alien toFetchAlien = (Alien) session.get(Alien.class, 101);
        System.out.println("Fetched from db: " + toFetchAlien);

        System.out.println(toSaveAlien == toFetchAlien?"yes":"no");
    }

    private static void BasicExample2() {
        System.out.println("==BasicExample2==");

        Laptop laptop = new Laptop();
        laptop.setLid(101);
        laptop.setLname("Dell");

        Student student = new Student();
        student.setName("Khaled");
        student.setRollNo(1);
        student.setMarks(50);
        student.getLaptops().add(laptop);

        laptop.getStudents().add(student);

        Configuration conf = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Laptop.class);

        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
                .applySettings(conf.getProperties())
                .buildServiceRegistry();

        SessionFactory sf = conf.buildSessionFactory(serviceRegistry);
        Session session = sf.openSession();

        session.beginTransaction();
        session.save(laptop);
        session.save(student);
        session.getTransaction().commit();
    }



    public static void main(String[] args) {
        //BasicExample1();
        BasicExample2();
    }
}
