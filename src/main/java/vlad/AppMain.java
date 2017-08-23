package vlad;

import org.hibernate.Session;

/**
 * Created by Владислав on 21.08.2017.
 */
public class AppMain {
    public static void main(String[] args) {
        System.out.println("Hibernate work");

        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();

        Users users = new Users(2,"Kirill","Tofan","tofanidze","aser2014","tofanidez@gmail.com","USER");

        session.save(users);
        session.getTransaction().commit();
        session.close();
    }
}
