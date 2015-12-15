package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.bonvio.settings.ResponseId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mil on 23.11.2015.
 * banana
 */

@Entity
public class Employee implements Serializable {

    private Integer id;
    private String department;
    private String position;
    private Individual individual;
    private Company company;
    private List<Task> taskList = new ArrayList<>();
    private List<Task> todoList = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @OneToOne
    @JsonIgnore
    public Individual getIndividual() {
        return individual;
    }
    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    @ManyToOne
    @JsonIgnore
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }

    @OneToMany(mappedBy = "employer")
    @JsonIgnore
    public List<Task> getTaskList() {
        return taskList;
    }
    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    @OneToMany(mappedBy = "employee")
    @JsonIgnore
    public List<Task> getTodoList() {
        return todoList;
    }
    public void setTodoList(List<Task> todoList) {
        this.todoList = todoList;
    }

}
