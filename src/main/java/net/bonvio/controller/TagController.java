package net.bonvio.controller;

import net.bonvio.model.Tag;
import net.bonvio.controller.generic.GenericController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mil on 02.12.15.
 */

@Controller
@RequestMapping("/tag")
public class TagController extends GenericController<Tag> {

}
