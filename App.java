package com.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Course Registration System ---");
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        List<String> subjects = new ArrayList<>();
        int totalCredits = 0;

        System.out.print("How many subjects do you want to register? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter Subject " + i + " name: ");
            subjects.add(scanner.nextLine());
            System.out.print("Enter credits for " + subjects.get(i-1) + ": ");
            totalCredits += scanner.nextInt();
            scanner.nextLine(); 
        }

        displayResults(name, id, subjects, totalCredits);
    }

    public static void displayResults(String name, String id, List<String> subjects, int credits) {
        System.out.println("\n--- Registration Details ---");
        System.out.println("Student: " + name + " (ID: " + id + ")");
        System.out.println("Registered Subjects: " + String.join(", ", subjects));
        System.out.println("Total Credits: " + credits);
        
        if (credits >= 15) {
            System.out.println("Status: ELIGIBLE");
        } else {
            System.out.println("Status: NOT ELIGIBLE (Minimum 15 credits required)");
        }
    }
}
