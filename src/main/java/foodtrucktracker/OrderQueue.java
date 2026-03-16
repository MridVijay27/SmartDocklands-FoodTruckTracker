/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtrucktracker;

import java.util.ArrayList;

/**
 * Queue ADT that implements QueueInterface.
 * Used to manage customer orders on a FIFO basis.
 * @author Mridhula Vijayakumar
 */
public class OrderQueue implements QueueInterface {

    private ArrayList<String> Queue;

    // Constructor (creates an empty queue)
    public OrderQueue() {
        Queue = new ArrayList<>();
    }

    // Returns true if the queue is empty
    @Override
    public boolean isEmpty() {
        return Queue.isEmpty();
    }

    // Returns the number of orders in the queue
    @Override
    public int size() {
        return Queue.size();
    }

    // Adds a new order to the end of the queue
    @Override
    public void enqueue(Object element) {
        Queue.add((String) element);
    }

    // Removes and returns the order from the front of the queue
    @Override
    public Object dequeue() {
        if (!Queue.isEmpty()) {
            return Queue.remove(0);
        } else {
            return null;
        }
    }

    // Returns the front order without removing it
    @Override
    public Object frontElement() {
        if (!Queue.isEmpty()) {
            return Queue.get(0);
        } else {
            return null;
        }
    }

    // Returns all orders in the queue as a String - useful for GUI display
    @Override
    public String displayQueue() {
        String result = "";
        if (Queue.isEmpty()) {
            result = "No orders in queue";
        } else {
            for (int i = 0; i < Queue.size(); i++) {
                result = result + "Order " + (i + 1) + ": " + Queue.get(i) + "\n";
            }
        }
        return result;
    }
}
