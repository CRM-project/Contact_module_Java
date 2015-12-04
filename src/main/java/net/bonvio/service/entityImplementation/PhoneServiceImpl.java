package net.bonvio.service.entityImplementation;

import net.bonvio.model.Phone;
import net.bonvio.service.generic.GenericServiceImpl;
import net.bonvio.service.entityInterface.PhoneService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class PhoneServiceImpl extends GenericServiceImpl<Phone> implements PhoneService {

}
