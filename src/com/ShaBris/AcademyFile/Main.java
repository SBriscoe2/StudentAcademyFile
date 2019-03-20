package com.ShaBris.AcademyFile;

import java.io.File;
import java.util.Scanner;

public class Main {

    private static StudentDirectory directory;

    public static void main(String[] args) {

        File file = new File("src/SuperheroStudentDirectory.txt");
        directory = new StudentDirectory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Superhero Academy Student Directory System!\n\n");
        String lastOption = "";
        while (!lastOption.equalsIgnoreCase("x")) {
            lastOption = displayMenu(scanner);
        }
        System.out.println("\nExiting System...\n");
    }

    private static String displayMenu(Scanner scanner) {
        System.out.println("Please select an option:");
        System.out.println("1. Enter new student details");
        System.out.println("2. View All Appointments");
        System.out.println("3. View Today's Appointments");
        System.out.println("X.  Exit System.");
        System.out.print("Option: ");
        String option = scanner.next();
        switch (option) {
            case "1": addStudentDetail(scanner);
                return option;
            default: System.out.println("Invalid option, please re-enter.");
                return option;
        }
     }

     private static void addStudentDetail(Scanner scanner) {
        scanner.nextLine();
         System.out.println("Enter student details");
         System.out.println("Student Last Name:  ");
         String lastName = scanner.nextLine();
         System.out.println("Student First Name: ");
         String firstName = scanner.nextLine();
         System.out.println("Student Date of Birth(dd/mm/yyyy):  ");
         String birthDate = scanner.nextLine();
         System.out.println("Gender: ");
         String gender = scanner.nextLine();
         System.out.println("Alias");
         String alias = scanner.nextLine();
         System.out.println("Hero/Sidekick: ");
         String partnerType = scanner.nextLine();
         try {
             directory.addNewStudent(lastName, firstName, birthDate, gender,
                     alias, partnerType);
         } catch (Throwable t) {
             System.out.println("Error: " + t.getMessage());
             return;
         }
         System.out.println("Student Details entered successfully.\n\n");
     }
    }

