package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.bonvio.settings.ResponseId;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by igorjan on 11.12.15.
 * banana
 */

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contact extends ResponseId implements Serializable {

    private Integer id;
    private ContactInfo contactFrom;
    private ContactInfo contactTo;

    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne
    @JsonIgnore
    public ContactInfo getContactFrom() {
        return contactFrom;
    }
    public void setContactFrom(ContactInfo contactFrom) {
        this.contactFrom = contactFrom;
    }

    @ManyToOne
    @JsonIgnore
    public ContactInfo getContactTo() {
        return contactTo;
    }
    public void setContactTo(ContactInfo contactTo) {
        this.contactTo = contactTo;
    }
}
