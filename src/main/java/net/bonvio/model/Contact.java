package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by igorjan on 11.12.15.
 * banana
 */

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contact implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private ContactInfo contactFrom;
    @ManyToOne
    private ContactInfo contactTo;

    public Contact(){}

    public Contact(ContactInfo contactFrom, ContactInfo contactTo) {
        this.contactFrom = contactFrom;
        this.contactTo = contactTo;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public ContactInfo getContactFrom() {
        return contactFrom;
    }

    public ContactInfo getContactTo() {
        return contactTo;
    }

    public void setContactFrom(ContactInfo contactFrom) {
        this.contactFrom = contactFrom;
    }

    public void setContactTo(ContactInfo contactTo) {
        this.contactTo = contactTo;
    }
}
