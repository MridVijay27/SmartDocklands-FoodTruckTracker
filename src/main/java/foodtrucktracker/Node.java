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
    private Object element;
    private Node next;
    
    public Node(Object inElement, Node inNext){
        element = inElement;
        next = inNext;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    @Override
    public String toString() {
        return "SlNode {element= " + element + "}";
    }
    
}
