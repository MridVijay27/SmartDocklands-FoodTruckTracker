/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtrucktracker;

/**
 *
 * @author Mridhula Vijayakumar
 */
public class Node {
    private Object element; // stores the FoodTruck object
    private Node next;      // reference to the next node in the list
    
    // Constructor - sets the element and the next node reference
    public Node(Object inElement, Node inNext){
        element = inElement;
        next = inNext;
    }
    
    // Returns the element stored in this node
    public Object getElement() {
        return element;
    }
    
    // Sets the element stored in this node
    public void setElement(Object element) {
        this.element = element;
    }

    // Returns the reference to the next node
    public Node getNext() {
        return next;
    }
    
    // Sets the reference to the next node
    public void setNext(Node next) {
        this.next = next;
    }
    
    // Returns a string representation of the node
    @Override
    public String toString() {
        return "SlNode {element= " + element + "}";
    }
    
}
