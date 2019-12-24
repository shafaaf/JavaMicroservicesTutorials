import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {
        System.out.println("Hi");

        Alien alien = new Alien();
        alien.setAid(101);
        alien.setAname("Shafaaf");
        alien.setColor("Green");

        Configuration conn = new Configuration();
        SessionFactory factory = conn.buildSessionFactory();

        Session session = factory.openSession();
        session.save(alien);
    }
}
