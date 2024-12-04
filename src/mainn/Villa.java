/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainn;

/**
 *
 * @author ACER^
 */
public class Villa extends Property{
    private boolean swimmingPool;
    private int adjacentStreets;
    
    public Villa(double area, int rooms, String neighborhood, double price, boolean swimmingPool, int adjacentStreets) {
        super(area, rooms, neighborhood, price);
        this.swimmingPool = swimmingPool;
        this.adjacentStreets = adjacentStreets;
    }
     @Override
    public String display() {
        return "Villa - Area: " + area + " m square, Rooms: " + rooms + ", Neighborhood: " + neighborhood + ", Price: $" + price + ", Swimming Pool: " + swimmingPool + ", Adjacent Streets: " + adjacentStreets;
    }
}
