/**....*/
package com.stackroute.swisit.usersearchservice.domain;
/*--------Importing Libraries-------*/
import org.hibernate.validator.constraints.NotEmpty;
import org.neo4j.ogm.annotation.NodeEntity;

/*--------Concept node Domain Class--------*/
@NodeEntity
public class Concept{

    /*-------Concept Class Properties------*/
    @NotEmpty
    private String name;

    /*-------Default Constructor of Concept Domain Class-------*/
    public Concept() {}

    /*-------Parameterized Constructor of Concept Domain Class-------*/
    public Concept(String name) {
        this.name = name;
    }


    /*------------Setter and Getter methods for Properties-----------*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}