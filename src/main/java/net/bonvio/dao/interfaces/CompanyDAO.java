package net.bonvio.dao.interfaces;

import net.bonvio.dao.generic.interfaces.GenericDAO;
import net.bonvio.model.Company;
import net.bonvio.model.Phone;
import net.bonvio.model.Email;
import net.bonvio.model.Social;
import net.bonvio.model.Tag;
import net.bonvio.model.Website;

import java.util.List;

/**
 * Created by mil on 30.11.15.
 * banana
 */
public interface CompanyDAO extends GenericDAO<Company> {
    List<Phone> getPhoneListByCompanyId(Integer id);
    List<Email> getEmailListByCompanyId(Integer id);
    List<Social> getSocialListByCompanyId(Integer id);
    List<Tag> getTagListByCompanyId(Integer id);
    List<Website> getWebsiteListByCompanyId(Integer id);
}
