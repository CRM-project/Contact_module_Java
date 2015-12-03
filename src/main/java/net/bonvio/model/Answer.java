package net.bonvio.model;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by vano on 17.11.15.
 */

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Answer implements Serializable {

    public Answer() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public int number;
    public String answerText;
    public String question;


    @ManyToOne
    @JsonIgnore
    public Customer customer;

    public int getId() {
        return id;
    }

/*    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", number=" + number +
                ", answerText='" + answerText + '\'' +
                ", question='" + question + '\'' +
                '}';
    }*/
}
