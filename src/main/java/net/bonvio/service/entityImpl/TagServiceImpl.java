package net.bonvio.service.entityImpl;

import net.bonvio.dao.GenericDAO;
import net.bonvio.model.Tag;
import net.bonvio.service.entity.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 02.12.15.
 */

@Service
@Transactional
public class TagServiceImpl implements TagService{

    @Autowired
    private GenericDAO<Tag> tagGenericDAO;

    @Override
    public void save(Tag tag) {
        tagGenericDAO.save(tag);
    }

    @Override
    public List<Tag> getList() {
        return tagGenericDAO.getList();
    }

    @Override
    public void delete(Tag tag) {
        tagGenericDAO.delete(tag);
    }

    @Override
    public void deleteById(Integer id) {
        tagGenericDAO.deleteById(id);
    }

    @Override
    public Tag getById(Integer id) {
        return tagGenericDAO.getById(id);
    }

    @Override
    public void update(Tag tag) {
        tagGenericDAO.update(tag);
    }
}
