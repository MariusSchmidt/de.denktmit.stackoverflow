package de.denktmit.stackoverflow.jackson.polymorphic.deductive;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import static com.fasterxml.jackson.annotation.JsonTypeInfo.Id.DEDUCTION;

@JsonTypeInfo(use = DEDUCTION)
@JsonSubTypes( {@JsonSubTypes.Type(Bird.class), @JsonSubTypes.Type(Fish.class)})
public class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

