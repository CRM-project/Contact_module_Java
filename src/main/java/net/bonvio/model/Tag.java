package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mil on 23.11.2015.
 */

@Entity
public class Tag  implements Serializable {

    public Tag() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    @Column(columnDefinition = "TEXT")
    public String title;

    @Column(columnDefinition = "TEXT")
    public String type;

    @ManyToOne
    @JsonIgnore
    public Contact contact;

}
