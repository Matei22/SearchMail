package com.company;
import java.io.Serial;
import java.io.Serializable;

public class Employee implements Serializable{

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String email;
    private double salary;

    public Employee() {};

    public Employee(int id, String name, String email, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
    }

}
