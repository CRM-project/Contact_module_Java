package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.bonvio.settings.ResponseId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mil on 23.11.2015.
 * banana
 */

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Inheritance(strategy= InheritanceType.JOINED)
public class ContactInfo extends ResponseId implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String shortName;
    private String fullName;
    private String type;
    private String address;
    private String description;
    private String visible;
    @OneToMany (mappedBy = "contactInfo")
    @JsonIgnore
    private List<Phone> phoneList = new ArrayList<>();
    @OneToMany (mappedBy = "contactInfo")
    @JsonIgnore
    private List<Website> websiteList = new ArrayList<>();
    @OneToMany (mappedBy = "contactInfo")
    @JsonIgnore
    private List<Email> emailList = new ArrayList<>();
    @OneToMany (mappedBy = "contactInfo")
    @JsonIgnore
    private List<Social> socialList = new ArrayList<>();
    @OneToMany (mappedBy = "contactInfo")
    @JsonIgnore
    private List<Tag> tagList = new ArrayList<>();
    @OneToMany (mappedBy = "contactFrom")
    @JsonIgnore
    private List<Contact> contactFrom = new ArrayList<>();
    @OneToMany (mappedBy = "contactTo")
    @JsonIgnore
    private List<Contact> contactTo = new ArrayList<>();

    public ContactInfo() {
    }

    public ContactInfo(Integer id) {
        super(id);
    }

    public ContactInfo(Integer id, String shortName, String fullName, String type, String address, String description, String visible, List<Phone> phoneList, List<Website> websiteList, List<Email> emailList, List<Social> socialList, List<Tag> tagList, List<Contact> contactFrom, List<Contact> contactTo) {
        this.id = id;
        this.shortName = shortName;
        this.fullName = fullName;
        this.type = type;
        this.address = address;
        this.description = description;
        this.visible = visible;
        this.phoneList = phoneList;
        this.websiteList = websiteList;
        this.emailList = emailList;
        this.socialList = socialList;
        this.tagList = tagList;
        this.contactFrom = contactFrom;
        this.contactTo = contactTo;
    }

    public Integer getId() {
        return id;
    }
    public String getShortName() {
        return shortName;
    }
    public String getFullName() {
        return fullName;
    }
    public String getType() {
        return type;
    }
    public String getAddress() {
        return address;
    }
    public String getDescription() {
        return description;
    }
    public String getVisible() {return visible; }
    public List<Phone> getPhoneList() {
        return phoneList;
    }
    public List<Website> getWebsiteList() {
        return websiteList;
    }
    public List<Email> getEmailList() {
        return emailList;
    }
    public List<Social> getSocialList() {
        return socialList;
    }
    public List<Tag> getTagList() {
        return tagList;
    }
    public List<Contact> getContactFrom() {
        return contactFrom;
    }
    public List<Contact> getContactTo() {
        return contactTo;
    }

    public void setType(String type) {
        this.type = type;
    }
}
