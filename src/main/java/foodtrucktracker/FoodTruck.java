/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtrucktracker;

/**
 *
 * @author Mridhula Vijayakumar
 */
public class FoodTruck extends Vehicle {
    private String truckName;
    private String cuisineType;
    private String location;

    // Default constructor
    public FoodTruck() {
    }
    
    public FoodTruck(String registrationNumber, String ownerName, String truckName, String cuisineType, String location) {
        super(registrationNumber, ownerName); // calls Vehicle constructor
        this.truckName = truckName;
        this.cuisineType = cuisineType;
        this.location = location;
    }
    
    // Returns the name of the food truck
    public String getTruckName() {
        return truckName;
    }
    
    // Sets the name of the food truck
    public void setTruckName(String truckName) {
        this.truckName = truckName;
    }

    // Returns the cuisine type of the food truck
    public String getCuisineType() {
        return cuisineType;
    }
    
    // Sets the cuisine type of the food truck
    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }
    
    // Returns the current location of the food truck
    public String getLocation() {
        return location;
    }
    
    // Sets the current location of the food truck
    public void setLocation(String location) {
        this.location = location;
    }
    
    // Overrides Vehicle toString - demonstrates polymorphism
    @Override
    public String toString() {
        return "FoodTruck {Truck name : " + truckName + ", Cuisine : " + cuisineType + 
               ", Location : " + location + ", Owner Name : " + getOwnerName() + 
               ", Reg.No : " + getRegistrationNumber() + "}";
    }
}
