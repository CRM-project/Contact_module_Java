package net.bonvio.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mil on 23.11.2015.
 * banana
 */

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne
    private Individual individual;

    public User() {
    }

    public User(Individual individual) {
        this.individual = individual;
    }

    public Integer getId() {
        return this.id;
    }
    public Individual getIndividual() {
        return individual;
    }
}


