package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mil on 23.11.2015.
 * banana
 */

@Entity
public class Social implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String socialUrl;
    private String type;
    @ManyToOne
    @JsonIgnore
    private ContactInfo contactInfo;

    public Social() {
    }

    public Social(String socialUrl, String type, ContactInfo contactInfo) {
        this.socialUrl = socialUrl;
        this.type = type;
        this.contactInfo = contactInfo;
    }

    public Integer getId() {
        return id;
    }
    public String getSocialUrl() {
        return socialUrl;
    }
    public String getType() {
        return type;
    }
    public ContactInfo getContactInfo() {
        return contactInfo;
    }
}
