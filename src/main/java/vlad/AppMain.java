package vlad;

import org.hibernate.Session;

import java.util.List;

/**
 * Created by Владислав on 21.08.2017.
 */
public class AppMain {
    public static void main(String[] args) {
        System.out.println("Hibernate work");

        Users users = new Users("Ragneda","Fedosenko","luchik","ragneda1119","bysia@gmail.com","USER");

        UserDAOImpl userDAO = new UserDAOImpl();
        //userDAO.save(users);

       // Users users1 = userDAO.read(2);
       // System.out.println(users1);

        //List<Users> list =userDAO.readAll();
      //  System.out.println(list);

       // userDAO.updateById(3, users);
       // userDAO.updateRoleById(3,users);
       // userDAO.remove(1);

    }
}
