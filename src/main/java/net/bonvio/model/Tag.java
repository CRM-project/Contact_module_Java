package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.bonvio.settings.ResponseId;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mil on 23.11.2015.
 * banana
 */

@Entity
public class Tag implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String type;
    @ManyToOne
    @JsonIgnore
    private ContactInfo contactInfo;

    public Tag() {
    }

    public Tag(String title, String type, ContactInfo contactInfo) {
        this.title = title;
        this.type = type;
        this.contactInfo = contactInfo;
    }

    public Integer getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getType() {
        return type;
    }
    public ContactInfo getContactInfo() {
        return contactInfo;
    }
}
