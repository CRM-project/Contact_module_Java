package net.bonvio.mvc;

import net.bonvio.model.*;
import net.bonvio.service.entity.CompanyService;
import net.bonvio.settings.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mil on 26.11.15.
 */

@Controller
@RequestMapping("/company")
public class CompanyController {

    /**
     * Autowired
     */
    @Autowired
    CompanyService companyService;

    /**
     *
     * @param view
     * @return hello
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getCustomerd(ModelAndView view) {

        view.setViewName("hello");

        return view;
    }

    /**
     * get companies list
     * @return
     */
    @RequestMapping(value="company", method = RequestMethod.GET)
    @ResponseBody
    public List<Company> getCompanies() {
        List<Company> list = companyService.getAll();
        return list;
    }

    /**
     * get company by id
     * @param id
     * @return
     */
    @RequestMapping(value = "company/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getCompany(@PathVariable Integer id) {
        return companyService.findById(id);
    }


    /**
     * create сompany
     * @param company
     * @return Company id (or Company, if uncommented "return Company")
     */
    @RequestMapping(value = "company", method = RequestMethod.POST)
    @ResponseBody
    public Object addCompany(@RequestBody Company company) {
        System.err.println(company);
        companyService.save(company);
        return new Id(company.getId());
        //return user;
    }

    /**
     * update company
     * @param company
     */
    @RequestMapping(value = "company", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public void updateUser(@RequestBody Company company) {
        companyService.update(company);
    }

    /**
     * delete company by id
     * @param id
     */
    @RequestMapping(value = "company/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(@PathVariable Integer id) {
        companyService.deleteById(id);
    }

    @RequestMapping(value = "company/getemaillist/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Email> getEmails(@PathVariable Integer id) {
        return companyService.getEmailListByCompanyId(id);
    }

    @RequestMapping(value = "company/getphonelist/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Phone> getPhones(@PathVariable Integer id) {
        return companyService.getPhoneListByCompanyId(id);
    }

    @RequestMapping(value = "company/getsociallist/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Social> getSocial(@PathVariable Integer id) {
        return companyService.getSocialListByCompanyId(id);
    }

    @RequestMapping(value = "company/gettaglist/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Tag> getTags(@PathVariable Integer id) {
        return companyService.getTagListByCompanyId(id);
    }

    @RequestMapping(value = "company/getwebsitelist/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Website> getWebSite(@PathVariable Integer id) {
        return companyService.getWebsiteListByCompanyId(id);
    }

}
