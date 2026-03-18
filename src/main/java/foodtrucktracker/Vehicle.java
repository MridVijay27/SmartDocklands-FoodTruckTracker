/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtrucktracker;

/**`
 *
 * @author Mridhula Vijayakumar
 */
public class Vehicle {
    private String registrationNumber;
    private String ownerName;
    
    //default constructor
    public Vehicle(){
        
    }
    public Vehicle(String registrationNumber, String ownerName) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
    }

    // Returns the registration number of the vehicle
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    
    // Sets the registration number of the vehicle
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    
    // Returns the owner name of the vehicle
    public String getOwnerName() {
        return ownerName;
    }
    
    // Sets the owner name of the vehicle
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    //toString to display Vehicle info
    @Override
    public String toString(){
        return "Vehicle {Reg.No : "+ registrationNumber + ", Owner Name : " + ownerName + " }";
    }
}
