/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainn;

import java.util.Scanner;
public class Mainn {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        RealEstateAgency agency = new RealEstateAgency();
        boolean running = true;

        while (running) {
            System.out.println("\nReal Estate Agency System");
            System.out.println("1. Add Property");
            System.out.println("2. Remove Property");
            System.out.println("3. Display Properties");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    agency.addPropertyFromInput(input);
                    break;
                case 2:
                    System.out.print("Enter the index of the property to remove: ");
                    int index = input.nextInt();
                    agency.removeProperty(index - 1);
                    break;
                case 3:
                    System.out.println("\nDisplay Properties:");
                    agency.displayProperties();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option, Please try again.");
            }
        }

        System.out.println("Exiting....");
    }
}
