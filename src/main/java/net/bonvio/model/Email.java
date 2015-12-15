package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mil on 23.11.2015.
 * banana
 */

@Entity
public class Email implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String email;
    private String type;
    @ManyToOne
    @JsonIgnore
    private ContactInfo contactInfo;

    public Email() {
    }

    public Email(String email, String type, ContactInfo contactInfo) {
        this.email = email;
        this.type = type;
        this.contactInfo = contactInfo;
    }

    public Integer getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public String getType() {
        return type;
    }
    public ContactInfo getContactInfo() {
        return contactInfo;
    }
}
