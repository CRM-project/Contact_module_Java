package net.bonvio.service.entityImpl;

import net.bonvio.model.User;

import net.bonvio.service.GenericServiceImpl;
import net.bonvio.service.entity.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class UserServiceImpl extends GenericServiceImpl<User> implements UserService {

}
