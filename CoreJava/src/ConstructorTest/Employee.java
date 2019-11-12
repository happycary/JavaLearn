package ConstructorTest;

import java.util.Random;

public class Employee {
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    static
    {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id = nextId;
        nextId ++;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this("Employee #" + nextId, salary);
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
