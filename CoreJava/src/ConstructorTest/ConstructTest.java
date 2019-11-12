package ConstructorTest;

public class ConstructTest {
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for (Employee e: staff)
            System.out.println("Name = " + e.getName() + ", id = " + e.getId() + ", salary = " + e.getSalary());
    }
}
