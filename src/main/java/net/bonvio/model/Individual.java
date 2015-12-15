package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mil on 24.11.2015.
 */

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Individual extends ContactInfo {
    @OneToOne
    @JsonIgnore
    private Employee employee;
    @OneToOne
    @JsonIgnore
    private User user;

    public Individual() {
    }

    public Individual(Integer id, String shortName, String fullName, String type, String address, String description, List<Phone> phoneList, List<Website> websiteList, List<Email> emailList, List<Social> socialList, List<Tag> tagList, List<Contact> contactFrom, List<Contact> contactTo) {
        super(id, shortName, fullName, type, address, description, phoneList, websiteList, emailList, socialList, tagList, contactFrom, contactTo);
    }

    public Employee getEmployee() {
        return employee;
    }

    public User getUser() {
        return user;
    }

}
