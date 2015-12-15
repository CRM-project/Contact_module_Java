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
public class Phone extends ResponseId implements Serializable {
    //@Override
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String phone;
    private String type;
    @ManyToOne
    @JsonIgnore
    private ContactInfo contactInfo;

    public Phone() {}

    public Phone(Integer id, String phone, String type, ContactInfo contactInfo) {
        super(id);
        this.phone = phone;
        this.type = type;
        this.contactInfo = contactInfo;
    }

    public Integer getId() {
        return id;
    }
    /*public void setId(Integer id) {
        this.id = id;
    }*/

    public String getPhone() {
        return phone;
    }
    /*public void setPhone(String phone) {
        this.phone = phone;
    }*/

    public String getType() {
        return type;
    }
    /*public void setType(String type) {
        this.type = type;
    }*/

    public ContactInfo getContactInfo() {
        return contactInfo;
    }
    /*public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }*/

}
