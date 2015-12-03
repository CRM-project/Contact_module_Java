package net.bonvio.mvc;

import net.bonvio.model.Website;
import net.bonvio.service.entity.WebsiteService;
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
@RequestMapping("/website")

public class WebsiteController {

    /**
     * Autowired
     */
    @Autowired
    WebsiteService websiteService;

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
     * get websites list
     * @return websites list
     */
    @RequestMapping(value="website", method = RequestMethod.GET)
    @ResponseBody
    public List<Website> getwebsites() {
        List<Website> list = websiteService.getList();
        return list;
    }

    /**
     * get website by id
     * @param id
     * @return website by id
     */
    @RequestMapping(value = "website/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getwebsite(@PathVariable Integer id) {
        return websiteService.getById(id);
    }

    /**
     * create website
     * @param website
     * @return website id (or website, if uncommented "return website")
     */
    @RequestMapping(value = "website", method = RequestMethod.POST)
    @ResponseBody
    public Object addwebsite(@RequestBody Website website) {
        System.err.println(website);
        websiteService.save(website);
        return new Id(website.getId());
        //return website;
    }

    /**
     * update website
     * @param website
     */
    @RequestMapping(value = "website", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public void updatewebsite(@RequestBody Website website) {
        System.out.println(website);
        websiteService.update(website);
    }

    /**
     * delete website by id
     * @param id
     */
    @RequestMapping(value = "website/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deletewebsite(@PathVariable Integer id) {
        System.out.println("remove website by id = " + id);
        websiteService.deleteById(id);
    }
}
