package net.bonvio.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by igorjan on 11.12.15.
 * banana
 */

@Entity
public class Task implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne (fetch = FetchType.EAGER)
    private Employee employer;
    @ManyToOne (fetch = FetchType.EAGER)
    private Employee employee;

    public Task() {
    }

    public Task(Employee employer, Employee employee) {
        this.employer = employer;
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }
    public Employee getEmployer() {
        return employer;
    }
    public Employee getEmployee() {
        return employee;
    }
}
