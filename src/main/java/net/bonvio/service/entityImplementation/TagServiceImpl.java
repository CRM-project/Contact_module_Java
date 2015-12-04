package net.bonvio.service.entityImplementation;

import net.bonvio.model.Tag;
import net.bonvio.service.generic.GenericServiceImpl;
import net.bonvio.service.entityInterface.TagService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 02.12.15.
 */

@Service
@Transactional
public class TagServiceImpl extends GenericServiceImpl<Tag> implements TagService{

}
