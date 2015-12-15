package net.bonvio.service.interfaces;

import net.bonvio.model.Contact;
import net.bonvio.service.generic.GenericService;

/**
 * Created by igorjan on 14.12.2015.
 */
public interface ContactService extends GenericService<Contact> {
    void addFriend(Integer fromId, Integer toId) throws Exception;
}

