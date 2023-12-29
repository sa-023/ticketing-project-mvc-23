package com.company.service.impl;
import com.company.dto.UserDTO;
import com.company.service.UserService;
import org.springframework.stereotype.Service;
import java.util.List;
/*
 * 🖍️...
 * · Overridden methods inherited from CrudService interface.
 * · Method implementations are inherited from the AbstractMapService abstract class, which for now we use to fake the database.
 *
 * · We can use the @Service annotation for service.impls classes instead of @Component.
 */
@Service
public class UserServiceImpl extends AbstractMapService<UserDTO,String> implements UserService {
    @Override
    public UserDTO save(UserDTO object) {
        return super.save(object.getUserName(), object);
    }

    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);
    }

    @Override
    public UserDTO findById(String  id) {
        return super.findById(id);
    }
}
