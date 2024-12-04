/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainn;

import java.util.ArrayList;
import java.util.Scanner;

public class RealEstateAgency {
   private ArrayList<Property> properties;

    public RealEstateAgency() {
        this.properties = new ArrayList<>();
    }

    public boolean addProperty(Property property) {
        if (properties.size() < 100) {
            properties.add(property);
            return true;
        } else {
            System.out.println("Cannot add more properties. Maximum limit reached.");
            return false;
        }
    }

    public boolean removeProperty(int index) {
        if (index < 0 || index >= properties.size()) {
            System.out.println("Invalid index. No property removed.");
            return false;
        } else {
            properties.remove(index);
            return true;
        }
    }

    public void displayProperties() {
        if (properties.isEmpty()) {
            System.out.println("No properties to display.");
        } else {
            for (int i = 0; i < properties.size(); i++) {
                System.out.println((i + 1) + ". " + properties.get(i).display());
            }
        }
    }

    public void addPropertyFromInput(Scanner input) {
        System.out.println("Choose Property Type: 1. Villa, 2. Apartment, 3. Furnished Apartment");
        int type = input.nextInt();

        System.out.print("Enter area (m square): ");
        double area = input.nextDouble();
        System.out.print("Enter number of rooms: ");
        int rooms = input.nextInt();
        System.out.print("Enter neighborhood: ");
        input.nextLine(); // Consume newline
        String neighborhood = input.nextLine();
        System.out.print("Enter price: ");
        double price = input.nextDouble();

        if (type == 1) {
            System.out.print("Has swimming pool? (true/false): ");
            boolean swimmingPool = input.nextBoolean();
            System.out.print("Enter number of adjacent streets: ");
            int adjacentStreets = input.nextInt();
            addProperty(new Villa(area, rooms, neighborhood, price, swimmingPool, adjacentStreets));
        } else if (type == 2) {  
            System.out.print("Enter floor: ");
            int floor = input.nextInt();
            System.out.print("Has parking lot? (true/false): ");
            boolean parkingLot = input.nextBoolean();
            addProperty(new Apartment(area, rooms, neighborhood, price, floor, parkingLot));
        } else if (type == 3) { 
            System.out.print("Enter floor: ");
            int floor = input.nextInt();
            System.out.print("Has parking lot? (true/false): ");
            boolean parkingLot = input.nextBoolean();
            System.out.print("Enter furniture quality (1-5): ");
            int furnitureQuality = input.nextInt();
            addProperty(new FurnishedApartment(area, rooms, neighborhood, price, floor, parkingLot, furnitureQuality));
        } else {
            System.out.println("Invalid property type.");
        }
    }
}
    

