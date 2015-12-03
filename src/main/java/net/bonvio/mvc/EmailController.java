package net.bonvio.mvc;

import net.bonvio.model.Email;
import net.bonvio.service.entity.EmailService;
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
@RequestMapping("/email")

public class EmailController {

    /**
     * Autowired
     */
    @Autowired
    EmailService emailService;

    /**
     *
     * @param view
     * @return hello
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getCustomerd(ModelAndView view) {
        view.setViewName("index");
        return view;
    }

    /**
     * get emails list
     * @return emails list
     */
    @RequestMapping(value="email", method = RequestMethod.GET)
    @ResponseBody
    public List<Email> getemails() {
        List<Email> list = emailService.getList();
        return list;
    }

    /**
     * get email by id
     * @param id
     * @return email by id
     */
    @RequestMapping(value = "email/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getemail(@PathVariable Integer id) {
        return emailService.getById(id);
    }

    /**
     * create email
     * @param email
     * @return email id (or email, if uncommented "return email")
     */
    @RequestMapping(value = "email", method = RequestMethod.POST)
    @ResponseBody
    public Object addemail(@RequestBody Email email) {
        System.err.println(email);
        emailService.save(email);
        return new Id(email.getId());
        //return email;
    }

    /**
     * update email
     * @param email
     */
    @RequestMapping(value = "email", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public void updateemail(@RequestBody Email email) {
        System.out.println(email);
        emailService.update(email);
    }

    /**
     * delete email by id
     * @param id
     */
    @RequestMapping(value = "email/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteemail(@PathVariable Integer id) {
        System.out.println("remove email by id = " + id);
        emailService.deleteById(id);
    }
}
