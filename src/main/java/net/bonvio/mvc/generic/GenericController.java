package net.bonvio.mvc.generic;

import net.bonvio.service.generic.GenericService;
import net.bonvio.settings.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

/**
 * Created by mil on 04.12.15.
 */

public class GenericController<T extends Id> {

    /**
     *
     */
    @Autowired
    GenericService<T> tGenericService;

    /**
     *
     * @param view
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getView(ModelAndView view) {
        view.setViewName("index");
        return view;
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<T> getList() {
        return tGenericService.getList();
    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getById(@PathVariable Integer id) {
        return tGenericService.getById(id);
    }

    /**
     * create t
     * @param t
     * @return contact id (or contact, if uncommented "return contact")
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public Object save(@RequestBody T t) {
        System.err.println(t);
        tGenericService.save(t);
        return new Id(t.getId());
        //return t;
    }

    /**
     * update t
     * @param t
     */
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody T t) {
        System.out.println(t);
        tGenericService.update(t);
    }

    /**
     * delete contact by id
     * @param id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable Integer id) {
        System.out.println("remove contact by id = " + id);
        tGenericService.deleteById(id);
    }

}
