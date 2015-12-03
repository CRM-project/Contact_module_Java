package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.sun.org.apache.xpath.internal.operations.String;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mil on 23.11.2015.
 */

@Entity
public class Phone implements Serializable {

    public Phone() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    @Column(columnDefinition = "TEXT")
    public String phone;

    @Column(columnDefinition = "TEXT")
    public String type;

    @ManyToOne
    @JsonIgnore
    public Contact contact;

    public Integer getId() {
        return id;
    }
}
