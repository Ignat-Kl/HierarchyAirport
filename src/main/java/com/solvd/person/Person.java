package com.solvd.person;

import com.solvd.interFace.PersonOperation;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Person implements PersonOperation {
    private String personId;
    private String personName;
    private String personSurname;
    private LocalDateTime dateOfBirth;
    private String personEmail;

    public Person(String personId, String personName, String personSurname,
                  LocalDateTime dateOfBirth, String personEmail) {
        this.personId = personId;
        this.personName = personName;
        this.personSurname = personSurname;
        this.dateOfBirth = dateOfBirth;
        this.personEmail = personEmail;
    }
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonSurname() {
        return personSurname;
    }

    public void setPersonSurname(String personSurname) {
        this.personSurname = personSurname;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth=dateOfBirth;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public abstract void displayInfo();

    @Override
    public void boardPassenger(){
    }
    @Override
    public void disembarkPassenger(){
    }
    @Override
    public void sellTicket(){}
    @Override
    public void checkTicket(){}

    @Override
    public String toString(){
        return "Person{" +
                "personId='" + personId + '\'' +
                ", personName='" + personName + '\'' +
                ", personSurname='" + personSurname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", personEmail='" + personEmail +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getPersonId(),person.getPersonId()) &&
                Objects.equals(getPersonName(),person.getPersonName()) &&
                Objects.equals(getPersonSurname(),person.getPersonSurname()) &&
                Objects.equals(getDateOfBirth(),person.getDateOfBirth()) &&
                Objects.equals(getPersonEmail(),person.getPersonEmail());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getPersonId(),getPersonName(), getPersonSurname(),getDateOfBirth(), getPersonEmail());
    }
}
