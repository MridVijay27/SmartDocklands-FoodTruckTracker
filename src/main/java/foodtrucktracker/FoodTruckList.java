/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodtrucktracker;

/**
 * Singly Linked List ADT that implements LinearListInterface.
 * Used to store and manage FoodTruck objects.
 * @author Mridhula Vijayakumar
 */
public class FoodTruckList implements LinearListInterface {

    private Node head;
    private Node currNode;
    private Node prevNode;
    private int iSize;

    // Constructor
    public FoodTruckList() {
        head = null;
        iSize = 0;
        currNode = head;
        prevNode = null;
    }

    // Returns true if the list is empty
    @Override
    public boolean isEmpty() {
        if (iSize == 0)
            return true;
        else
            return false;
    }

    // Returns the number of elements in the list
    @Override
    public int size() {
        return iSize;
    }

    // Moves currNode and prevNode to the given position
    private void setCurrent(int iPosition) {
        int iCount;
        prevNode = null;
        currNode = head;
        for (iCount = 1; iCount < iPosition; iCount++) {
            prevNode = currNode;
            currNode = currNode.getNext();
        }
    }

    // Adds a new element at a specific position in the list
    @Override
    public void add(int iPosition, Object theElement) {
        // special case - adding at the head of the list
        if (iPosition == 1) {
            Node newNode = new Node(theElement, head);
            head = newNode;
        } else {
            setCurrent(iPosition);
            Node newNode = new Node(theElement, currNode);
            prevNode.setNext(newNode);
        }
        iSize = iSize + 1;
    }

    // Adds a new element at the end of the list
    @Override
    public void add(Object theElement) {
        if (isEmpty()) {
            Node newNode = new Node(theElement, null);
            head = newNode;
        } else {
            // traverse to the end of the list
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            Node newNode = new Node(theElement, null);
            temp.setNext(newNode);
        }
        iSize = iSize + 1;
    }

    // Removes the element at the given position
    @Override
    public void remove(int iPosition) {
        // special case - removing the head of the list
        if (iPosition == 1) {
            head = head.getNext();
        } else {
            setCurrent(iPosition);
            prevNode.setNext(currNode.getNext());
        }
        iSize = iSize - 1;
    }

    // Returns the element at the given position
    @Override
    public Object get(int iPosition) {
        setCurrent(iPosition);
        return currNode.getElement();
    }

    // Replaces the element at the given position with a new one
    public void update(int iPosition, Object theElement) {
        setCurrent(iPosition);
        currNode.setElement(theElement);
    }

    // Prints all elements in the list
    @Override
    public void printList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.getElement().toString());
            tempNode = tempNode.getNext();
        }
    }

    // Returns all elements as a single String
    public String displayList() {
        String result = "";
        Node tempNode = head;
        while (tempNode != null) {
            result = result + tempNode.getElement().toString() + "\n";
            tempNode = tempNode.getNext();
        }
        return result;
    }
}
