package com.solvd.person;

import java.time.LocalDateTime;
import java.util.Objects;

public class AirportEmployee extends Person {
    private String position;
    private double salary;


    public AirportEmployee(String personId, String personName, String personSurname,
                           LocalDateTime dateOfBirth, String position, double salary, String personEmail) {

        super(personId,personName,personSurname,dateOfBirth,personEmail);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public void displayInfo(){
        System.out.println("AirportEmployee ID: " + getPersonId());
        System.out.println("AirportEmployee Name: " + getPersonName());
        System.out.println("AirportEmployee Position: " + getPosition());
        System.out.println("AirportEmployee Salary: " + getSalary());
    }
    @Override
    public void sellTicket(){};
    @Override
    public void checkTicket(){};

    @Override
    public String toString(){
        return "AirportEmployee{" +
                "Position='" + position + '\'' +
                ", Salary=" + salary +
                "}" + super.toString();
    }
   @Override
   public boolean equals(Object o){
       if(this == o) return true;
       if(!(o instanceof AirportEmployee)) return false;
       AirportEmployee employee = (AirportEmployee) o;
       return Objects.equals(getPosition(),employee.getPosition()) &&
               Objects.equals(getSalary(), employee.getSalary()) &&
               super.equals(o);
   }
    @Override
    public int hashCode(){
        return Objects.hash(getPosition(), getSalary());
    }
}
