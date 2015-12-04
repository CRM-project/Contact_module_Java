package net.bonvio.dao.entityInterface;

import net.bonvio.dao.generic.GenericDAO;
import net.bonvio.model.Company;
import net.bonvio.model.Phone;
import net.bonvio.model.Email;
import net.bonvio.model.Social;
import net.bonvio.model.Tag;
import net.bonvio.model.Website;

import java.util.List;

/**
 * Created by mil on 30.11.15.
 */
public interface CompanyDao extends GenericDAO<Company> {
    List<Phone> getPhoneListByCompanyId(Integer id);
    List<Email> getEmailListByCompanyId(Integer id);
    List<Social> getSocialListByCompanyId(Integer id);
    List<Tag> getTagListByCompanyId(Integer id);
    List<Website> getWebsiteListByCompanyId(Integer id);
}
