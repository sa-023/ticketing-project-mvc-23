package com.company.service.impl;
import com.company.dto.ProjectDTO;
import com.company.service.ProjectService;
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
public class ProjectServiceImpl extends AbstractMapService<ProjectDTO,String> implements ProjectService {
    @Override
    public ProjectDTO save(ProjectDTO object) {
        return super.save(object.getProjectCode(), object);
    }
    @Override
    public List<ProjectDTO> findAll() {
        return super.findAll();
    }
    @Override
    public void update(ProjectDTO object) {
        super.update(object.getProjectCode(), object);
    }
    @Override
    public void deleteById(String id) {
        super.deleteById(id);
    }
    @Override
    public ProjectDTO findById(String id) {
        return super.findById(id);
    }


}
