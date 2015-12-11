package net.bonvio.service.interfaces;

import net.bonvio.model.Individual;
import net.bonvio.model.Phone;
import net.bonvio.service.generic.GenericService;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */
public interface IndividualService extends GenericService<Individual> {
    List<Phone> getPhoneListById(Integer id);
}

