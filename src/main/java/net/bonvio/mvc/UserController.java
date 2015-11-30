package net.bonvio.mvc;

import net.bonvio.model.User;
import net.bonvio.service.entity.UserService;
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
@RequestMapping("/user")

public class UserController {

    /**
     * Autowired
     */
    @Autowired
    UserService userService;

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
     * get users list
     * @return users list
     */
    @RequestMapping(value="user", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUsers() {
        List<User> list = userService.getAll();
        return list;
    }

    /**
     * get user by id
     * @param id
     * @return user by id
     */
    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getUser(@PathVariable Integer id) {
        return userService.findById(id);
    }

    /**
     * create user
     * @param user
     * @return user id (or user, if uncommented "return user")
     */
    @RequestMapping(value = "user", method = RequestMethod.POST)
    @ResponseBody
    public Object addUser(@RequestBody User user) {
        System.err.println(user);
        userService.save(user);
        return new Id(user.getId());
        //return user;
    }

    /**
     * update user
     * @param user
     */
    @RequestMapping(value = "user", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public void updateUser(@RequestBody User user) {
        System.out.println(user);
        userService.update(user);
    }

    /**
     * delete user by id
     * @param id
     */
    @RequestMapping(value = "user/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(@PathVariable Integer id) {
        System.out.println("remove user by id = " + id);
        userService.deleteById(id);
    }
}
