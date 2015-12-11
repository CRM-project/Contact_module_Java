package net.bonvio.model;

import net.bonvio.settings.ResponseId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by mil on 09.12.15.
 */

@Entity
public class Task extends ResponseId implements Serializable {

    private Integer id;
    private String name;
    private String description;
    private Date dateCreate;
    private Date dateClose;
    private Integer status;
    private Employee employer;
    private Employee employee;

    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateCreate() {
        return dateCreate;
    }
    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateClose() {
        return dateClose;
    }
    public void setDateClose(Date dateClose) {
        this.dateClose = dateClose;
    }

    //@ManyToOne (fetch = FetchType.LAZY)
    @ManyToOne (fetch = FetchType.EAGER)
    //@JsonIgnore
    @Transient
    public Employee getEmployer() {
        return employer;
    }
    public void setEmployer(Employee employer) {
        this.employer = employer;
    }

    @ManyToOne //(fetch = FetchType.LAZY)
    //@JsonIgnore
    @Transient
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

}
