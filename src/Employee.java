
public class Employee {

    public String Name;
    public double Salary;
    public int WorkHours;
    public int HireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.Name = name;
        this.Salary = salary;
        this.WorkHours = workHours;
        this.HireYear = hireYear;
    }

    public double tax(double salary) {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public int bonus(int workhours) {
        if (workhours < 40) {
            return 0;
        } else {
            return (workhours - 40) * 30;
        }
    }

    public double raiseSalary(double salary, int hireYear) {
        if (2012 < hireYear) {
            return salary * 0.05;
        } else if (2001 > hireYear) {
            return salary * 0.15;

        } else if (2002 >= hireYear) {
            return salary * 0.1;

        } else {
            return 0;
        }
    }

}
