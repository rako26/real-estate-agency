/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainn;

/**
 *
 * @author ACER^
 */
public class FurnishedApartment extends Apartment {
        private int furnitureQuality;
        
        public FurnishedApartment(double area, int rooms, String neighborhood, double price, int floor, boolean parkingLot, int furnitureQuality) {
        super(area, rooms, neighborhood, price, floor, parkingLot);
        this.furnitureQuality = furnitureQuality;
    }
    @Override
    public String display() {
        return "Furnished Apartment - Area: " + area + " m square, Rooms: " + rooms + ", Neighborhood: " + neighborhood +
               ", Price: $" + price + ", Floor: " + floor + ", Parking Lot: " + parkingLot +
               ", Furniture Quality: " + furnitureQuality;
    }
}
