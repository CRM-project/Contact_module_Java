package net.bonvio.service.implementations;

import net.bonvio.model.ContactInfo;
import net.bonvio.service.generic.GenericServiceImpl;
import net.bonvio.service.interfaces.ContactInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class ContactInfoInfoServiceImpl extends GenericServiceImpl<ContactInfo> implements ContactInfoService {

}
