package net.bonvio.service.interfaces;

import net.bonvio.model.*;
import net.bonvio.service.generic.GenericService;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */
public interface IndividualService extends GenericService<Individual> {
    //List<Phone> getPhoneListById(Integer id);

    List<Phone> getPhoneListByPhoneId(Integer id);
    List<Email> getEmailListByPhoneId(Integer id);
    List<Social> getSocialListByPhoneId(Integer id);
    List<Tag> getTagListByPhoneId(Integer id);
    List<Website> getWebsiteListByPhoneId(Integer id);

}

