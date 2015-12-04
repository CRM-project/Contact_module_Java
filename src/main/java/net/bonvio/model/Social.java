package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.bonvio.settings.IdValidate;

import javax.persistence.*;
import java.io.Serializable;

//import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by mil on 23.11.2015.
 */

@Entity
public class Social extends IdValidate implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String socialUrl;

    @Column(columnDefinition = "TEXT")
    private String type;

    @ManyToOne
    @JsonIgnore
    private Contact contact;

    public Social() {
    }

    @Override
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

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

}
