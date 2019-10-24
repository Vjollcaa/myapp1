package com.ucx.training.sessions.myapp1.businesslogic;

public class Employee {
    private String firstName;
    private String lastName;
    private Position position;
    private Gender gender;
    private Address address;
    private Double workingHoursPerMonth;

    public Employee(){

    }
    public Employee(String firstName, String lastName, Position position, Gender gender, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.gender = gender;
        this.address = address;
      //  this.workingHoursPerMonth = workingHoursPerMonth;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double calculateWage(double workingHoursPerMonth){

        var salary = workingHoursPerMonth * this.position.getWage();
        return salary;
    }
}
