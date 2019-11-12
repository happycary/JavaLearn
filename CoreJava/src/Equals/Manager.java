package Equals;

public class Manager extends Employee
{
    private double bonus;

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

    @Override
    public boolean equals(Object o)
    {
        if(!super.equals(o)) return false;

        Manager other = (Manager)o;
        return bonus == other.bonus;
    }

    @Override
    public int hashCode()
    {
        return super.hashCode() + 17 * new Double(bonus).hashCode();
    }

    @Override
    public String toString()
    {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}
