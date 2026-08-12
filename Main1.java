package module2;

import java.util.Scanner;

class Employee {
    String name, address;
    int age, mob;
    float sal;

    void print_Salary() {
        System.out.println("Salary: " + sal);
    }
}

class Officer extends Employee {
    String spl;

    void print_Specialization() {
        System.out.println("Specialization: " + spl);
    }
}

class Manager extends Employee {
    String dep;

    void print_Dept() {
        System.out.println("Department: " + dep);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Officer o = new Officer();

        System.out.print("Enter Officer's Name: ");
        o.name = sc.nextLine();

        System.out.print("Enter Address: ");
        o.address = sc.nextLine();

        System.out.print("Enter Age: ");
        o.age = sc.nextInt();

        System.out.print("Enter Mobile Number: ");
        o.mob = sc.nextInt();

        System.out.print("Enter Salary: ");
        o.sal = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter Specialization: ");
        o.spl = sc.nextLine();

        System.out.println("\n--- Officer Details ---");
        System.out.println("Name: " + o.name);
        System.out.println("Address: " + o.address);
        System.out.println("Age: " + o.age);
        System.out.println("Mobile: " + o.mob);
        o.print_Salary();
        o.print_Specialization();

        Manager m = new Manager();

        System.out.print("\nEnter Manager's Name: ");
        m.name = sc.nextLine();

        System.out.print("Enter Address: ");
        m.address = sc.nextLine();

        System.out.print("Enter Age: ");
        m.age = sc.nextInt();

        System.out.print("Enter Mobile Number: ");
        m.mob = sc.nextInt();

        System.out.print("Enter Salary: ");
        m.sal = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter Department: ");
        m.dep = sc.nextLine();

        System.out.println("\n--- Manager Details ---");
        System.out.println("Name: " + m.name);
        System.out.println("Address: " + m.address);
        System.out.println("Age: " + m.age);
        System.out.println("Mobile: " + m.mob);
        m.print_Salary();
        m.print_Dept();

        sc.close();
    }
}