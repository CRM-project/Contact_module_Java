package net.bonvio.controller;

import net.bonvio.model.*;
import net.bonvio.controller.generic.GenericController;
import net.bonvio.service.interfaces.CompanyService;
import net.bonvio.service.interfaces.ContactService;
import net.bonvio.settings.ResponseId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mil on 27.11.15.
 */

@Controller
@RequestMapping("/contact")
public class ContactController extends GenericController<Contact> {
    @Autowired
    ContactService contactService;

    @RequestMapping(
            value = "{fromId}/{toId}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Void> addFriend(@PathVariable Integer fromId, @PathVariable Integer toId) {
        try {
            contactService.addFriend(fromId, toId);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
