package net.bonvio.mvc.entityController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import net.bonvio.model.*;
import net.bonvio.mvc.generic.GenericController;
import net.bonvio.service.entityInterface.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.invoke.empty.Empty;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mil on 26.11.15.
 */

@Controller
@RequestMapping("/company")
public class CompanyController extends GenericController<Company> {

    /**
     * Autowired
     */
    @Autowired
    CompanyService companyService;

    @RequestMapping(value = "email/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Email>> listAllEmails(@PathVariable Integer id) {
        List<Email> emailArrayList = new ArrayList<>();

        emailArrayList = companyService.getEmailListByCompanyId(id);
        if (emailArrayList == null) {
            return null;
        }
        else return new ResponseEntity<List<Email>>(companyService.getEmailListByCompanyId(id), HttpStatus.OK);
    }

    /*@RequestMapping(value = "email1/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Email> getEmails(@PathVariable Integer id) {
        return companyService.getEmailListByCompanyId(id);
    }*/

    @RequestMapping(value = "phone/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Phone> getPhones(@PathVariable Integer id) {
        return companyService.getPhoneListByCompanyId(id);
    }

    @RequestMapping(value = "social/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Social> getSocial(@PathVariable Integer id) {
        return companyService.getSocialListByCompanyId(id);
    }

    @RequestMapping(value = "tag/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Tag> getTags(@PathVariable Integer id) {
        return companyService.getTagListByCompanyId(id);
    }

    @RequestMapping(value = "website/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Website> getWebSite(@PathVariable Integer id) {
        return companyService.getWebsiteListByCompanyId(id);
    }

}
