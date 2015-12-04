package net.bonvio.service.entityImplementation;

import net.bonvio.model.Website;
import net.bonvio.service.generic.GenericServiceImpl;
import net.bonvio.service.entityInterface.WebsiteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class WebiteServiceImpl extends GenericServiceImpl<Website> implements WebsiteService {

}
