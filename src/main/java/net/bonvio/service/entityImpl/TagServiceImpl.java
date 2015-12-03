package net.bonvio.service.entityImpl;

import net.bonvio.model.Tag;
import net.bonvio.service.GenericServiceImpl;
import net.bonvio.service.entity.TagService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 02.12.15.
 */

@Service
@Transactional
public class TagServiceImpl extends GenericServiceImpl<Tag> implements TagService{

}
