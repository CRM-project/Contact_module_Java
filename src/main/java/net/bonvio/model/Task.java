package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.bonvio.settings.ResponseId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by mil on 09.12.15.
 */

@Entity
public class Task extends ResponseId implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String description;
    private Date dateCreate;
    private Date dateClose;

    @ManyToOne //(fetch = FetchType.LAZY)
    //@JsonIgnore
    private Employee employeeOwner;

    @ManyToOne //(fetch = FetchType.LAZY)
    //@JsonIgnore
    private Employee employeeExecutor;

    public Task() {
    }

    @Override
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

    public Employee getEmployeeOwner() {
        return employeeOwner;
    }

    public void setEmployeeOwner(Employee employeeOwner) {
        this.employeeOwner = employeeOwner;
    }

    public Employee getEmployeeExecutor() {
        return employeeExecutor;
    }

    public void setEmployeeExecutor(Employee employeeExecutor) {
        this.employeeExecutor = employeeExecutor;
    }
}
