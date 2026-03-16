/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtrucktracker;

import java.util.ArrayList;

/**
 * Stack ADT that implements StackInterface.
 * Used to keep track of recently added food trucks (LIFO).
 * @author Mridhula Vijayakumar
 */
public class RecentTruckStack implements StackInterface {

    private ArrayList<FoodTruck> stack;

    // Constructor (creates an empty stack)
    public RecentTruckStack() {
        stack = new ArrayList<>();
    }

    // Returns true if the stack is empty
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Pushes a new FoodTruck onto the top of the stack
    @Override
    public void push(Object newItem) {
        stack.add(0, (FoodTruck) newItem);
    }

    // Removes and returns the FoodTruck from the top of the stack
    @Override
    public Object pop() {
        if (!stack.isEmpty()) {
            return stack.remove(0);
        } else {
            return null;
        }
    }

    // Returns the top item without removing it
    @Override
    public Object peek() {
        if (!stack.isEmpty()) {
            return stack.get(0);
        } else {
            return null;
        }
    }

    // Returns the number of items in the stack
    @Override
    public int size() {
        return stack.size();
    }

    // Returns all stack contents as a String
    @Override
    public String displayStack() {
        String result = "";
        if (stack.isEmpty()) {
            result = "Stack is empty";
        } else {
            for (int i = 0; i < stack.size(); i++) {
                result = result + stack.get(i).toString() + "\n";
            }
        }
        return result;
    }
}
