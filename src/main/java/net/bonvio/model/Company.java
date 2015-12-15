package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mil on 24.11.2015.
 */

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
//@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Company extends ContactInfo {
    @OneToMany (mappedBy = "company")
    @JsonIgnore
    private List<Employee> employeeList = new ArrayList<>();

    public Company() {
    }

    public Company(Integer id, String shortName, String fullName, String type, String address, String description, List<Phone> phoneList, List<Website> websiteList, List<Email> emailList, List<Social> socialList, List<Tag> tagList, List<Contact> contactFrom, List<Contact> contactTo) {
        super(id, shortName, fullName, type, address, description, phoneList, websiteList, emailList, socialList, tagList, contactFrom, contactTo);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
