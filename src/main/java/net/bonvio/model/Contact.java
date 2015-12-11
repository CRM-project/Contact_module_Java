//package net.bonvio.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import net.bonvio.settings.ResponseId;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.List;
//
///**
// * Created by igorjan on 11.12.15.
// */
//
//@Entity
//@JsonIgnoreProperties(ignoreUnknown = true)
//public class Contact extends ResponseId implements Serializable {
//
//    private Integer id;
//    //private List<ContactInfo> contactInfoList;
//
//    @Override
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    public Integer getId() {
//        return id;
//    }
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    //@OneToMany(mappedBy = "contact")
//   /* @ManyToMany(mappedBy = "contactList")
//    @JsonIgnore
//    public List<ContactInfo> getContactInfoList() {
//        return contactInfoList;
//    }
//
//    public void setContactInfoList(List<ContactInfo> contactInfoList) {
//        this.contactInfoList = contactInfoList;
//    }*/
//}
