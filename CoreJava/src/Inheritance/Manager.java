package Inheritance;

public class Manager extends Employee
{
    public double bonus;

    public Manager(String name, double salary, int year, int month, int day)
    {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    @Override
    public double getSalary()
    {
        return super.getSalary() + bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }
}
