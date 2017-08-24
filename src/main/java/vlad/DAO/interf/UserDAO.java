package vlad.DAO.interf;

import vlad.DAO.model.Users;

import java.util.List;

/**
 * Created by Владислав on 23.08.2017.
 */
public interface UserDAO {
    public void save(Users users);
    public List<Users> readAll();
    public Users read(int id);
    public void remove(int id);

    public void updateById(int id, Users users);
    public void updateRoleById(int id, Users users);

}
