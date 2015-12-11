package net.bonvio.controller;

import net.bonvio.model.Individual;
import net.bonvio.controller.generic.GenericController;
import net.bonvio.service.interfaces.IndividualService;
import net.bonvio.settings.ResponseId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mil on 27.11.15.
 */

@Controller
@RequestMapping("/individual")
public class IndividualController extends GenericController<Individual> {

    @Autowired
    IndividualService individualService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public Object save(@RequestBody Individual individual) {
        individual.setType("individual");
        individualService.save(individual);
        return new ResponseId(individual.getId());
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody Individual individual) {
        individual.setType("individual");
        individualService.update(individual);
    }

    @RequestMapping(value = "banana/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object banana(@PathVariable int id) {
        return individualService.getPhoneListById(id);
    }

}
