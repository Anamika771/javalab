package module2;

import java.util.Scanner;

class Students {
    String name, course;
    int rollNo;

    void setDetails(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class StudentAccount extends Students {
    float collegeFee;

    void setCollegeFee(float collegeFee) {
        this.collegeFee = collegeFee;
    }
}

class Hosteller extends StudentAccount {
    float hostelFee, messFee;

    void setHostelDetails(float hostelFee, float messFee) {
        this.hostelFee = hostelFee;
        this.messFee = messFee;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("College Fee: " + collegeFee);
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);
        System.out.println("Total Fee: " + (collegeFee + hostelFee + messFee));
    }
}

class DayScholar extends StudentAccount {
    float busFee;

    void setBusFee(float busFee) {
        this.busFee = busFee;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("College Fee: " + collegeFee);
        System.out.println("Bus Fee: " + busFee);
        System.out.println("Total Fee: " + (collegeFee + busFee));
    }
}

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Hosteller
        Hosteller h = new Hosteller();

        System.out.println("Enter Hosteller Details");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter College Fee: ");
        float collegeFee = sc.nextFloat();

        System.out.print("Enter Hostel Fee: ");
        float hostelFee = sc.nextFloat();

        System.out.print("Enter Mess Fee: ");
        float messFee = sc.nextFloat();

        h.setDetails(name, rollNo, course);
        h.setCollegeFee(collegeFee);
        h.setHostelDetails(hostelFee, messFee);

        System.out.println("\n--- Hosteller Details ---");
        h.displayDetails();

        // Day Scholar
        sc.nextLine();

        DayScholar d = new DayScholar();

        System.out.println("\nEnter Day Scholar Details");

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter College Fee: ");
        collegeFee = sc.nextFloat();

        System.out.print("Enter Bus Fee: ");
        float busFee = sc.nextFloat();

        d.setDetails(name, rollNo, course);
        d.setCollegeFee(collegeFee);
        d.setBusFee(busFee);

        System.out.println("\n--- Day Scholar Details ---");
        d.displayDetails();

        sc.close();
    }
}