package com.endava.feignclient.model;

public class Person {

    private Long id;

    private String name;

    private String surname;

    private String profession;

    public Person(String name, String surname, String profession) {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
    }

    public Person(Long id, String name, String surname, String profession) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.profession = profession;
    }

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
