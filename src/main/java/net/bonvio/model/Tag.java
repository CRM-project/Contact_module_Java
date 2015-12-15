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

    private Integer id;
    private String title;
    private String type;
    private ContactInfo contactInfo;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @ManyToOne
    @JsonIgnore
    public ContactInfo getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

}
