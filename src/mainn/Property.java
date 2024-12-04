/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainn;

/**
 *
 * @author ACER^
 */
abstract class Property {
    protected double area;
    protected int rooms;
    protected String neighborhood;
    protected double price;

    public Property(double area, int rooms, String neighborhood, double price) {
        this.area = area;
        this.rooms = rooms;
        this.neighborhood = neighborhood;
        this.price = price;
    }
    public abstract String display();
}
