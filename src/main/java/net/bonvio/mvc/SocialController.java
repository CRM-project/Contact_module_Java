package net.bonvio.mvc;

import net.bonvio.model.Social;
import net.bonvio.service.entity.SocialService;
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
@RequestMapping("/social")

public class SocialController {

    /**
     * Autowired
     */
    @Autowired
    SocialService socialService;

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
     * get socials list
     * @return socials list
     */
    @RequestMapping(value="social", method = RequestMethod.GET)
    @ResponseBody
    public List<Social> getsocials() {
        List<Social> list = socialService.getList();
        return list;
    }

    /**
     * get social by id
     * @param id
     * @return social by id
     */
    @RequestMapping(value = "social/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getsocial(@PathVariable Integer id) {
        return socialService.getById(id);
    }

    /**
     * create social
     * @param social
     * @return social id (or social, if uncommented "return social")
     */
    @RequestMapping(value = "social", method = RequestMethod.POST)
    @ResponseBody
    public Object addsocial(@RequestBody Social social) {
        System.err.println(social);
        socialService.save(social);
        return new Id(social.getId());
        //return social;
    }

    /**
     * update social
     * @param social
     */
    @RequestMapping(value = "social", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public void updatesocial(@RequestBody Social social) {
        System.out.println(social);
        socialService.update(social);
    }

    /**
     * delete social by id
     * @param id
     */
    @RequestMapping(value = "social/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deletesocial(@PathVariable Integer id) {
        System.out.println("remove social by id = " + id);
        socialService.deleteById(id);
    }
}
