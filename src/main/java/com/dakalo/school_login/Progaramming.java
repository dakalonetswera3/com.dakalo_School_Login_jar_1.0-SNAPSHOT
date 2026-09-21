  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dakalo.school_login;

import java.util.Scanner;

public class Progaramming {
//Main method where program execution begins
    public static void main(String[] args) {
        //Create Scaner object to read user input from the console 
        Scanner input = new Scanner(System.in);
        //Instantiate RegisterUser class to handle login and registration logic
        RegisterUser reg = new RegisterUser();
        
        //Boolean flag to control the main application loop
        boolean run = true;
        
        // Main menu loop that keeps running until the user chooses to exit
        while (run) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            String choice = input.nextLine();
            
            // Option 1: Handle user login
            if (choice.equals("1")) {
                // LOGIN FEATURE
                System.out.print("Enter Username: ");
                String username = input.nextLine();

                System.out.print("Enter Password: ");
                String password = input.nextLine();
                
                // check credentials and print status message
                boolean isLoggedIn = reg.loginUser(username, password);
                String statusMessage = reg.returnLoginStatus(isLoggedIn);
                System.out.println(statusMessage);
                
                // Option 2: Handle new registration
            } else if (choice.equals("2")) {
                // REGISTRATION FEATURE
                System.out.print("Enter First Name: ");
                String firstName = input.nextLine();

                System.out.print("Enter Last Name: ");
                String lastName = input.nextLine();

                System.out.print("Enter Username: ");
                String username = input.nextLine();

                System.out.print("Enter Password: ");
                String password = input.nextLine();

                System.out.print("Enter Cell Phone Number (e.g. +27838968976): ");
                String cellNumber = input.nextLine();

                // Send captured inputs to RegisterUser class
                String result = reg.registerUser(username, password, cellNumber, firstName, lastName);
                System.out.println(result);
                
                // Option3 : Exit the program
            } else if (choice.equals("3")) {
                // EXIT FEATURE
                System.out.println("Exiting program. Goodbye!");
                run = false;
                // Handle invalid menu selections
            } else {
                System.out.println("Invalid option, please choose 1, 2, or 3.");
            }
        }

        input.close();
    }
}