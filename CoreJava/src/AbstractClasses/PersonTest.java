package AbstractClasses;

public class PersonTest
{
    public static void main(String[] args)
    {
        Person[] p = new Person[2];

        p[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        p[1] = new Student("Maria Morris", "computer science");

        for(Person k : p)
            System.out.println(k.getName() + ", " + k.getDescription());
    }
}
