package net.bonvio.service.entityImplementation;

import net.bonvio.model.User;

import net.bonvio.service.generic.GenericServiceImpl;
import net.bonvio.service.entityInterface.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class UserServiceImpl extends GenericServiceImpl<User> implements UserService {

}
