package net.bonvio.model;

import net.bonvio.settings.ResponseId;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by igorjan on 11.12.15.
 * banana
 */

@Entity
public class Task extends ResponseId implements Serializable {
    private Integer id;
    private Employee employer;
    private Employee employee;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne (fetch = FetchType.EAGER)
    public Employee getEmployer() {
        return employer;
    }
    public void setEmployer(Employee employer) {
        this.employer = employer;
    }

    @ManyToOne (fetch = FetchType.EAGER)
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
