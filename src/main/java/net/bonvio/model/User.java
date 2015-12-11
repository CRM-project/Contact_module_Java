package net.bonvio.model;

import net.bonvio.settings.ResponseId;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mil on 23.11.2015.
 */

@Entity
public class User extends ResponseId implements Serializable {

    private Integer id;
    private Individual individual;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @OneToOne
    //@JsonIgnore

    public Individual getIndividual() {
        return individual;
    }
    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", individual=" + individual +
                '}';
    }
}


