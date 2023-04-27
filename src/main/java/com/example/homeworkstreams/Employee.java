package com.example.homeworkstreams;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

import static org.apache.tomcat.util.IntrospectionUtils.capitalize;

public class Employee {
    private final String firstName;
    private final String lastName;
    private int department;
    private double salary;


    public Employee(String firstName, String lastName, int department, double salary) {
        this.firstName = capitalize(firstName);
        this.lastName = capitalize(lastName);
        this.department = department;
        this.salary = salary;
    }
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getFirstName().equals(employee.getFirstName()) && getLastName().equals(employee.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }


}
