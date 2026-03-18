/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtrucktracker;

import foodtrucktracker.FoodTruck;
import foodtrucktracker.FoodTruckList;
import foodtrucktracker.OrderQueue;
import foodtrucktracker.RecentTruckStack;
import foodtrucktracker.Vehicle;

/**
 * Main class to test all ADTs and functionality.
 * Tests SLList, RecentTruckStack and OrderQueue.
 * @author Mridhula Vijayakumar
 */
public class FoodTruckApp {

    public static void main(String[] args) {
        
        System.out.println("Testing Singly Linked List: ");
        
        // Create the linked list
        FoodTruckList truckList = new FoodTruckList();
        
        // CREATE - add food trucks to the list
        FoodTruck fList1 = new FoodTruck("101-D-1234", "John Murphy", "Burger Bliss", "American", "Mayor Street");
        FoodTruck fList2 = new FoodTruck("102-D-5678", "Sarah Kelly", "Taco Town", "Mexican", "Custom House Quay");
        FoodTruck fList3 = new FoodTruck("103-D-9101", "Ali Hassan", "Spice Route", "Indian", "George's Dock");
        
        truckList.add(fList1);
        truckList.add(fList2);
        truckList.add(fList3);
        System.out.println("Trucks added to list. Size: " + truckList.size());
        
        //print all trucks
        System.out.println("\n All Trucks in List: ");
        truckList.printList();
        
        //update truck at position 2
        System.out.println("\n Updating truck at position 2: ");
        FoodTruck updatedTruck = new FoodTruck("192-D-5678", "Sarah Kelly", "Taco Town", "Mexican", "North Wall Quay");
        truckList.update(2, updatedTruck);
        truckList.printList();
        
        //remove truck at position 1
        System.out.println("\n Removing truck at position 1: ");
        truckList.remove(1);
        System.out.println("After removal. Size: " + truckList.size());
        truckList.printList();
        
        //get truck at position 1
        System.out.println("\n Getting truck at position 1: ");
        FoodTruck retrieved = (FoodTruck) truckList.get(1);
        System.out.println("Retrieved: " + retrieved.toString());
        
        
        System.out.println("\n Testing Stack: ");
        
        // Create the stack
        RecentTruckStack truckStack = new RecentTruckStack();
        
        // push trucks onto the stack
        truckStack.push(fList1);
        truckStack.push(fList2);
        truckStack.push(fList3);
        System.out.println("Trucks pushed to stack. Size: " + truckStack.size());
        
        // peek at the top
        System.out.println("Top of stack: " + truckStack.peek().toString());
        
        // display stack
        System.out.println("\n Display Stack: ");
        System.out.println(truckStack.displayStack());
        
        // pop from stack
        System.out.println("-- Popping from stack --");
        FoodTruck popped = (FoodTruck) truckStack.pop();
        System.out.println("Popped: " + popped.toString());
        System.out.println("Stack size after pop: " + truckStack.size());
        
        // check isEmpty
        System.out.println("Is stack empty: " + truckStack.isEmpty());
        
        
        System.out.println("\n===== TESTING QUEUE =====");
        
        // Create the queue
        OrderQueue orderQueue = new OrderQueue();
        
        // enqueue some orders
        orderQueue.enqueue("2 Burgers and chips");
        orderQueue.enqueue("1 Taco and drink");
        orderQueue.enqueue("3 Curries");
        System.out.println("Orders added to queue. Size: " + orderQueue.size());
        
        // check front element
        System.out.println("Front order: " + orderQueue.frontElement().toString());
        
        // display queue
        System.out.println("\n-- Display Queue --");
        System.out.println(orderQueue.displayQueue());
        
        // dequeue an order
        System.out.println("-- Processing next order --");
        String processed = (String) orderQueue.dequeue();
        System.out.println("Processed: " + processed);
        System.out.println("Queue size after dequeue: " + orderQueue.size());
        
        // check isEmpty
        System.out.println("Is queue empty: " + orderQueue.isEmpty());
        
        
        System.out.println("\n===== TESTING INHERITANCE AND POLYMORPHISM =====");
        
        // Vehicle reference pointing to FoodTruck object - polymorphism
        Vehicle v = new FoodTruck("194-D-1111", "Mary Byrne", "Pizza Palace", "Italian", "Spencer Dock");
        System.out.println("Vehicle reference: " + v.toString());
        
        
        System.out.println("\n===== ALL TESTS COMPLETE =====");
        
        // Launch the GUI
        GUI myGUI = new GUI();
        myGUI.setVisible(true);
    }
}
