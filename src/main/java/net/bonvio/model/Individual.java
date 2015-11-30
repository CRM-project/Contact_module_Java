package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mil on 24.11.2015.
 */

@Entity
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Individual extends Contact {

    @OneToOne
    @JsonIgnore
    public Employee employee;

    public Individual() {
        System.out.println("Was created Individual Class");
    }
}
