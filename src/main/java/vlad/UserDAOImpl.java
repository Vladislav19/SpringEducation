package vlad;

import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Владислав on 23.08.2017.
 */
public class UserDAOImpl implements UserDAO {

    public void save(Users users) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(users);
        session.getTransaction().commit();
        session.close();
    }

    public List<Users> readAll() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM  Users ");
        List<Users> listusers = query.list();
        session.getTransaction().commit();
        session.close();
        return  listusers;
    }

    public Users read(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Users users = (Users) session.get(Users.class, id);
        session.getTransaction().commit();
        session.close();
        return users;
    }

    public void remove(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Users users = (Users) session.get(Users.class, id);
        session.delete(users);
        session.getTransaction().commit();
        session.close();
    }



    public void updateById(int id, Users u1) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Users users = (Users) session.get(Users.class, id);
        users.setFirstname(u1.getFirstname());
        users.setSecondname(u1.getSecondname());
        users.setLogin(u1.getLogin());
        users.setEmail(u1.getEmail());
        users.setPassword(u1.getPassword());
        users.setRole(u1.getRole());
        session.getTransaction().commit();
        session.close();
    }

    public void updateRoleById(int id, Users u1) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Users users = (Users) session.get(Users.class, id);
        users.setRole(u1.getRole());
        session.getTransaction().commit();
        session.close();
    }
}
