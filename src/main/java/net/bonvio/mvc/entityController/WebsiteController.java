package net.bonvio.mvc.entityController;

import net.bonvio.model.Website;
import net.bonvio.mvc.generic.GenericController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mil on 27.11.15.
 */

@Controller
@RequestMapping("/website")
public class WebsiteController extends GenericController<Website> {

}
