package net.bonvio.mvc;

import net.bonvio.model.Contact;
import net.bonvio.service.entity.ContactService;
import net.bonvio.settings.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by mil on 27.11.15.
 */

@Controller
@RequestMapping("/contact")

public class ContactController {

    /**
     * Autowired
     */
    @Autowired
    ContactService contactService;

    /**
     *
     * @param view
     * @return hello
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getContactView(ModelAndView view) {
        view.setViewName("index");
        return view;
    }

    /**
     * get contacts list
     * @return contacts list
     */
    @RequestMapping(value="contact", method = RequestMethod.GET)
    @ResponseBody
    public List<Contact> getContacts() {
        List<Contact> list = contactService.getList();
        return list;
    }

    /**
     * get contact by id
     * @param id
     * @return contact by id
     */
    @RequestMapping(value = "contact/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getContactById(@PathVariable Integer id) {
        return contactService.getById(id);
    }

    /**
     * create contact
     * @param contact
     * @return contact id (or contact, if uncommented "return contact")
     */
    @RequestMapping(value = "contact", method = RequestMethod.POST)
    @ResponseBody
    public Object addContactByObject(@RequestBody Contact contact) {
        System.err.println(contact);
        contactService.save(contact);
        return new Id(contact.getId());
        //return contact;
    }

    /**
     * update contact
     * @param contact
     */
    @RequestMapping(value = "contact", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public void updateContactByObject(@RequestBody Contact contact) {
        System.out.println(contact);
        contactService.update(contact);
    }

    /**
     * delete contact by id
     * @param id
     */
    @RequestMapping(value = "contact/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteContactById(@PathVariable Integer id) {
        System.out.println("remove contact by id = " + id);
        contactService.deleteById(id);
    }
}
