package net.bonvio.service.entity;

import net.bonvio.model.*;
import net.bonvio.service.GenericService;

import java.util.List;

/**
 * Created by mil on 26.11.15.
 */
public interface CompanyService extends GenericService<Company> {

    List<Phone> getPhoneListByCompanyId(Integer id);
    List<Email> getEmailListByCompanyId(Integer id);
    List<Social> getSocialListByCompanyId(Integer id);
    List<Tag> getTagListByCompanyId(Integer id);
    List<Website> getWebsiteListByCompanyId(Integer id);

}
