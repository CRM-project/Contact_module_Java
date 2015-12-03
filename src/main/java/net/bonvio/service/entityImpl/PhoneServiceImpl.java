package net.bonvio.service.entityImpl;

import net.bonvio.model.Phone;
import net.bonvio.service.GenericServiceImpl;
import net.bonvio.service.entity.PhoneService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class PhoneServiceImpl extends GenericServiceImpl<Phone> implements PhoneService {

}
