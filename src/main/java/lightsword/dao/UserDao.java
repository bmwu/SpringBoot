package lightsword.dao;

import lightsword.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by michael on 8/2/17.
 */
public interface UserDao extends CrudRepository<User, Integer> {

    List<User> findAll();
}
