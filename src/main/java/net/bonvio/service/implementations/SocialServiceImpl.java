package net.bonvio.service.implementations;

import net.bonvio.model.Social;
import net.bonvio.service.generic.GenericServiceImpl;
import net.bonvio.service.interfaces.SocialService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class SocialServiceImpl extends GenericServiceImpl<Social> implements SocialService {

}
