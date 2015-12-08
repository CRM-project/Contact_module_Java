package net.bonvio.mvc.entityController;

import net.bonvio.model.Company;
import net.bonvio.model.Contact;
import net.bonvio.mvc.generic.GenericController;
import net.bonvio.service.entityInterface.CompanyService;
import net.bonvio.service.entityInterface.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mil on 27.11.15.
 */

@Controller
@RequestMapping("/contact")
public class ContactController extends GenericController<Contact> {

}
