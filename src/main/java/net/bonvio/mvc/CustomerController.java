package net.bonvio.mvc;

import net.bonvio.model.Customer;
import net.bonvio.service.entity.CustomerService;
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
@RequestMapping("/customer")

public class CustomerController {

    /**
     * Autowired
     */
    @Autowired
    CustomerService customerService;

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
     * get customers list
     * @return customers list
     */
    @RequestMapping(value="customer", method = RequestMethod.GET)
    @ResponseBody
    public List<Customer> getcustomers() {
        List<Customer> list = customerService.getList();
        return list;
    }

    /**
     * get customer by id
     * @param id
     * @return customer by id
     */
    @RequestMapping(value = "customer/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getcustomer(@PathVariable Integer id) {
        return customerService.getById(id);
    }

    /**
     * create customer
     * @param customer
     * @return customer id (or customer, if uncommented "return customer")
     */
    @RequestMapping(value = "customer", method = RequestMethod.POST)
    @ResponseBody
    public Object addCustomer(@RequestBody Customer customer) {
        System.err.println(customer);
        customerService.save(customer);
        return new Id(customer.getId());
        //return customer;
    }

    /**
     * update customer
     * @param customer
     */
    @RequestMapping(value = "customer", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public void updatecustomer(@RequestBody Customer customer) {
        System.out.println(customer);
        customerService.update(customer);
    }

    /**
     * delete customer by id
     * @param id
     */
    @RequestMapping(value = "customer/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deletecustomer(@PathVariable Integer id) {
        System.out.println("remove customer by id = " + id);
        customerService.deleteById(id);
    }
}
