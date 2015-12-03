package net.bonvio.service.entityImpl;

import net.bonvio.model.Email;
import net.bonvio.service.GenericServiceImpl;
import net.bonvio.service.entity.EmailService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class EmailServiceImpl extends GenericServiceImpl<Email> implements EmailService {

}
