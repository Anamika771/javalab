package tutorial;

import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double salary;

    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class Employeeclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] emp = new Employee[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details of Employee " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            emp[i] = new Employee(id, name, salary);
        }

        System.out.println("\nEmployee Details:");
        for (Employee e : emp) {
            e.displayEmployee();
        }

        sc.close();
    }
}