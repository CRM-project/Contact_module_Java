package net.bonvio.mvc;

import net.bonvio.model.Tag;
import net.bonvio.service.entity.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by mil on 02.12.15.
 */

@Controller
@RequestMapping("/tag")
public class TagController {

    /**
     * Autowired
     */
    @Autowired
    TagService tagService;

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
     * get users list
     * @return users list
     */
    @RequestMapping(value="tag", method = RequestMethod.GET)
    @ResponseBody
    public List<Tag> getTags() {
        List<Tag> list = tagService.getList();
        return list;
    }



}
