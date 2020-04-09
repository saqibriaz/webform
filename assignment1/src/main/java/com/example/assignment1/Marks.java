package com.example.assignment1;

import com.fasterxml.jackson.annotation.JsonTypeId;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Marks {
    @Id
    public String name;
    public String marks;
    @Override
    public String toString() {
        return "Marks{" +
                "name='" + name + '\'' +
                ", marks='" + marks + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }


}
