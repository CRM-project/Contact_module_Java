package net.bonvio.service.entity;

import net.bonvio.model.*;

import java.util.List;

/**
 * Created by mil on 26.11.15.
 */
public interface CompanyService {


    void save(Company company);
    List<Company> getAll();
    void delete(Company company);
    void deleteById(Integer id);
    Company findById(Integer id);
    void update(Company company);

    List<Phone> getPhoneListByCompanyId(Integer id);
    List<Email> getEmailListByCompanyId(Integer id);
    List<Social> getSocialListByCompanyId(Integer id);
    List<Tag> getTagListByCompanyId(Integer id);
    List<Website> getWebsiteListByCompanyId(Integer id);

}
