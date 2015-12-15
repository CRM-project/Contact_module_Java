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
public class Website implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String websiteUrl;
    private String type;
    @ManyToOne
    @JsonIgnore
    private ContactInfo contactInfo;

    public Website() {
    }

    public Website(String websiteUrl, String type, ContactInfo contactInfo) {
        this.websiteUrl = websiteUrl;
        this.type = type;
        this.contactInfo = contactInfo;
    }

    public Integer getId() {
        return id;
    }
    public String getWebsiteUrl() {
        return websiteUrl;
    }
    public String getType() {
        return type;
    }
    public ContactInfo getContactInfo() {
        return contactInfo;
    }
}
