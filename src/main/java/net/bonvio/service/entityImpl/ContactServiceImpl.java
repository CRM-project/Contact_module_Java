package net.bonvio.service.entityImpl;

import net.bonvio.model.Contact;
import net.bonvio.service.GenericServiceImpl;
import net.bonvio.service.entity.ContactService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class ContactServiceImpl extends GenericServiceImpl<Contact> implements ContactService {

}
