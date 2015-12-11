package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.bonvio.settings.ResponseId;

import javax.persistence.*;
import java.io.Serializable;

//import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by mil on 23.11.2015.
 */

@Entity
public class Social extends ResponseId implements Serializable {

    private Integer id;
    private String socialUrl;
    private String type;
    private ContactInfo contactInfo;

    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getSocialUrl() {
        return socialUrl;
    }
    public void setSocialUrl(String socialUrl) {
        this.socialUrl = socialUrl;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @ManyToOne
    @JsonIgnore
    @Transient
    public ContactInfo getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

}
