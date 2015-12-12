package net.bonvio.controller;

import net.bonvio.model.*;
import net.bonvio.controller.generic.GenericController;
import net.bonvio.service.interfaces.CompanyService;
import net.bonvio.settings.ResponseId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mil on 26.11.15.
 */

@Controller
@RequestMapping("/company")
public class CompanyController extends GenericController<Company> {

    @Autowired
    CompanyService companyService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public Object save(@RequestBody Company company) {
        company.setType("company");
        companyService.save(company);
        return new ResponseId(company.getId());
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody Company company) {
        company.setType("company");
        companyService.update(company);
    }

    @RequestMapping(
            value = "phone/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<Phone>> listAllPhone(@PathVariable Integer id) {
        List<Phone> phoneList = null;
        try {
            phoneList = companyService.getPhoneListByCompanyId(id);
            if (phoneList.isEmpty()) phoneList = new ArrayList<>();
        } catch (Exception e) {
            return new ResponseEntity<>(phoneList, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(phoneList, HttpStatus.OK);
    }

    @RequestMapping(
            value = "email/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<Email>> listAllEmails(@PathVariable Integer id) {
        List<Email> emailList = null;
        try {
            emailList = companyService.getEmailListByCompanyId(id);
            if (emailList.isEmpty()) emailList = new ArrayList<>();
        } catch (Exception e) {
            return new ResponseEntity<>(emailList, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(emailList, HttpStatus.OK);
    }

    @RequestMapping(
            value = "social/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<Social>> listAllSocial(@PathVariable Integer id) {
        List<Social> socialList = null;
        try {
            socialList = companyService.getSocialListByCompanyId(id);
            if (socialList.isEmpty()) socialList = new ArrayList<>();
        } catch (Exception e) {
            return new ResponseEntity<>(socialList, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(socialList, HttpStatus.OK);
    }

    @RequestMapping(
            value = "tag/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<Tag>> tagAllPhone(@PathVariable Integer id) {
        List<Tag> tagList = null;
        try {
            tagList = companyService.getTagListByCompanyId(id);
            if (tagList.isEmpty()) tagList = new ArrayList<>();
        } catch (Exception e) {
            return new ResponseEntity<>(tagList, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(tagList, HttpStatus.OK);
    }

    @RequestMapping(
            value = "website/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<Website>> listAllWebsite(@PathVariable Integer id) {
        List<Website> websiteList = null;
        try {
            websiteList = companyService.getWebsiteListByCompanyId(id);
            if (websiteList == null) websiteList = new ArrayList<>();
        } catch (Exception e) {
            return new ResponseEntity<>(websiteList, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(websiteList, HttpStatus.OK);
    }

}
