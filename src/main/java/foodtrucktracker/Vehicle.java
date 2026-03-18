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
    
    public Vehicle(){
        
    }
    public Vehicle(String registrationNumber, String ownerName) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    //toString to display Vehicle info
    @Override
    public String toString(){
        return "Vehicle {Reg.No : "+ registrationNumber + ", Owner Name : " + ownerName + " }";
    }
}
