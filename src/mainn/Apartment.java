/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainn;

/**
 *
 * @author ACER^
 */
public class Apartment extends Property{
    protected int floor;
    protected boolean parkingLot;
     
    public Apartment(double area, int rooms, String neighborhood, double price, int floor, boolean parkingLot) {
        super(area, rooms, neighborhood, price);
        this.floor = floor;
        this.parkingLot = parkingLot;
    }
     @Override
    public String display() {
        return "Apartment - Area: " + area + " m square, Rooms: " + rooms + ", Neighborhood: " + neighborhood +
               ", Price: $" + price + ", Floor: " + floor + ", Parking Lot: " + parkingLot;
    }
}
