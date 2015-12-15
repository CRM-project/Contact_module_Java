package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String department;
    private String position;
    @OneToOne
    @JsonIgnore
    private Individual individual;
    @ManyToOne
    @JsonIgnore
    private Company company;
    @OneToMany(mappedBy = "employer")
    @JsonIgnore
    private List<Task> taskList = new ArrayList<>();
    @OneToMany(mappedBy = "employee")
    @JsonIgnore
    private List<Task> todoList = new ArrayList<>();

    public Employee() {
    }

    public Employee(String department, String position, Individual individual, Company company, List<Task> taskList, List<Task> todoList) {
        this.department = department;
        this.position = position;
        this.individual = individual;
        this.company = company;
        this.taskList = taskList;
        this.todoList = todoList;
    }

    public Integer getId() {
        return id;
    }
    public String getDepartment() {
        return department;
    }
    public String getPosition() {
        return position;
    }
    public Individual getIndividual() {
        return individual;
    }
    public Company getCompany() {
        return company;
    }
    public List<Task> getTaskList() {
        return taskList;
    }
    public List<Task> getTodoList() {
        return todoList;
    }
}
