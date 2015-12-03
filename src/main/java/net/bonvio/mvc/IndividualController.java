package net.bonvio.mvc;

import net.bonvio.model.Individual;
import net.bonvio.service.entity.IndividualService;
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
@RequestMapping("/individual")

public class IndividualController {

    /**
     * Autowired
     */
    @Autowired
    IndividualService individualService;

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
     * get individuals list
     * @return individuals list
     */
    @RequestMapping(value="individual", method = RequestMethod.GET)
    @ResponseBody
    public List<Individual> getindividuals() {
        List<Individual> list = individualService.getAll();
        return list;
    }

    /**
     * get individual by id
     * @param id
     * @return individual by id
     */
    @RequestMapping(value = "individual/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getindividual(@PathVariable Integer id) {
        return individualService.findById(id);
    }

    /**
     * create individual
     * @param individual
     * @return individual id (or individual, if uncommented "return individual")
     */
    @RequestMapping(value = "individual", method = RequestMethod.POST)
    @ResponseBody
    public Object addindividual(@RequestBody Individual individual) {
        System.err.println(individual);
        individualService.save(individual);
        return new Id(individual.getId());
        //return individual;
    }

    /**
     * update individual
     * @param individual
     */
    @RequestMapping(value = "individual", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public void updateindividual(@RequestBody Individual individual) {
        System.out.println(individual);
        individualService.update(individual);
    }

    /**
     * delete individual by id
     * @param id
     */
    @RequestMapping(value = "individual/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteindividual(@PathVariable Integer id) {
        System.out.println("remove individual by id = " + id);
        individualService.deleteById(id);
    }
}
