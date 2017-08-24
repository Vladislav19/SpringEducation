package vlad.DAO.implement;

import org.junit.*;
import vlad.DAO.model.Users;

import static org.junit.Assert.*;

/**
 * Created by Владислав on 24.08.2017.
 */
public class UserDAOImplTest {

    private UserDAOImpl userDAO;
    private Users users,users1,users2;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before UserDaoImplsTest.class");
    }
    @AfterClass
    public  static void afterClass() {
        System.out.println("After UserDaoImplsTest.class");
    }

    @Before
    public void initTest() {
        userDAO = new UserDAOImpl();
        users = new Users("Ragneda","Fedosenko","luchik","ragneda1119","bysia@gmail.com","USER");
        users1 = new Users("Kristina","Hudik","tinka","tinka123","kriss@mail.ru","USER");
        users2 = new Users("Sveta","Greckevich","svetka","qwer1234","svetik@mail.ru","ADMIN");
    }

    @After
    public void afterTest() {
        userDAO = null;
        users = null;
        users1 = null;
        users2 = null;
    }

    @Test
    public void save() throws Exception {

    }

    @Test
    public void readAll() throws Exception {
    }

    @Test
    public void read() throws Exception {
    }

    @Test
    public void remove() throws Exception {
    }

    @Test
    public void updateById() throws Exception {

    }

    @Test
    public void updateRoleById() throws Exception {
    }

}