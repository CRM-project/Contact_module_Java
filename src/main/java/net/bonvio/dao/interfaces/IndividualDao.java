package net.bonvio.dao.interfaces;

import net.bonvio.dao.generic.interfaces.GenericDAO;
import net.bonvio.model.*;
import java.util.List;

/**
 * Created by mil on 30.11.15.
 * banana
 */
public interface IndividualDao extends GenericDAO<Individual> {
    List<Phone> getPhoneListByIndividualId(Integer id);
    List<Email> getEmailListByIndividualId(Integer id);
    List<Social> getSocialListByIndividualId(Integer id);
    List<Tag> getTagListByIndividualId(Integer id);
    List<Website> getWebsiteListByIndividualId(Integer id);
}
