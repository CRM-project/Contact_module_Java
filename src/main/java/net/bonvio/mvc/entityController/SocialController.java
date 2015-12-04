package net.bonvio.mvc.entityController;

import net.bonvio.model.Social;
import net.bonvio.mvc.generic.GenericController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mil on 27.11.15.
 */

@Controller
@RequestMapping("/social")
public class SocialController extends GenericController<Social> {

}
