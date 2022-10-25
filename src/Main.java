import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        double salary, sumSalary, tax, raiseSalary, salarywithTaxandBonus;
        int workHours, hireYear, bonus;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Employee Name:");
        name = scanner.next();
        System.out.println("Employee Salary:");
        salary = scanner.nextDouble();
        System.out.println("Amount Of Employee Worked Hours:");
        workHours = scanner.nextInt();
        System.out.println("Employee Entry Date:");
        hireYear = scanner.nextInt();

        Employee employee = new Employee(name, salary, workHours, hireYear);

        tax = employee.tax(employee.Salary);
        bonus = employee.bonus(employee.WorkHours);
        salarywithTaxandBonus = employee.Salary + bonus - tax;
        raiseSalary = employee.raiseSalary(salarywithTaxandBonus, employee.HireYear);
        sumSalary = salarywithTaxandBonus + raiseSalary;
        System.out.println("Employee Name: " + employee.Name);
        System.out.println("Employee Salary: " + employee.Salary);
        System.out.println("Amount Of Employee Worked Hours: " + employee.WorkHours);
        System.out.println("Employee Entry Date: " + employee.HireYear);
        System.out.println("Employee Tax Cut: " + tax);
        System.out.println("Employee Bonus: " + bonus);
        System.out.println("Employee Raise Salary :" + raiseSalary);
        System.out.println("Employee Final Salary: " + sumSalary);


    }


}
