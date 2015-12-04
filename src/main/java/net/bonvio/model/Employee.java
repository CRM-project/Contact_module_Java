package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mil on 23.11.2015.
 */

@Entity
public class Employee extends net.bonvio.settings.Id implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    public String department;

    public String position;

    @OneToOne
    @JsonIgnore
    public Individual individual;

    @ManyToOne
    @JsonIgnore
    public Company company;

    @OneToOne
    @JsonIgnore
    public User user;

    public Employee() {
        System.out.println("Was created Employee Class");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
