package net.bonvio.mvc;

import net.bonvio.model.Phone;
import net.bonvio.service.entity.PhoneService;
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
@RequestMapping("/phone")

public class PhoneController {

    /**
     * Autowired
     */
    @Autowired
    PhoneService phoneService;

    /**
     *
     * @param view
     * @return hello
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getPhoneMVC(ModelAndView view) {
        view.setViewName("hello");
        return view;
    }

    /**
     * get phones list
     * @return phones list
     */
    @RequestMapping(value="phone", method = RequestMethod.GET)
    @ResponseBody
    public List<Phone> getphones() {
        List<Phone> list = phoneService.getAll();
        return list;
    }

    /**
     * get phone by id
     * @param id
     * @return phone by id
     */
    @RequestMapping(value = "phone/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getphone(@PathVariable Integer id) {
        return phoneService.findById(id);
    }

    /**
     * create phone
     * @param phone
     * @return phone id (or phone, if uncommented "return phone")
     */
    @RequestMapping(value = "phone", method = RequestMethod.POST)
    @ResponseBody
    public Object addphone(@RequestBody Phone phone) {
        System.err.println(phone);
        phoneService.save(phone);
        return new Id(phone.getId());
        //return phone;
    }

    /**
     * update phone
     * @param phone
     */
    @RequestMapping(value = "phone", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public void updatephone(@RequestBody Phone phone) {
        System.out.println(phone);
        phoneService.update(phone);
    }

    /**
     * delete phone by id
     * @param id
     */
    @RequestMapping(value = "phone/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deletephone(@PathVariable Integer id) {
        System.out.println("remove phone by id = " + id);
        phoneService.deleteById(id);
    }
}
