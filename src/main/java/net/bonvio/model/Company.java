package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mil on 24.11.2015.
 */

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Company extends Contact implements Serializable {

    public Company() {
        System.out.println("Was created Company Class");
    }

    @OneToMany (mappedBy = "company")
    @JsonIgnore
    public List<Employee> employeeList = new ArrayList();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

}
