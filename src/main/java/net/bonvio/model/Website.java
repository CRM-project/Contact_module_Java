package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.sun.org.apache.xpath.internal.operations.String;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mil on 23.11.2015.
 */

@Entity
public class Website extends net.bonvio.settings.Id implements Serializable {

    public Website() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    @Column(columnDefinition = "TEXT")
    public String websiteUrl;

    @Column(columnDefinition = "TEXT")
    public String type;

    @ManyToOne
    @JsonIgnore
    public Contact contact;

    public Integer getId() {
        return id;
    }
}
