/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package foodtrucktracker;

/**
 *Interface behind the behaviours for the Singly Linked List ADT.
 * @author Mridhula Vijayakumar
 */
public interface LinearListInterface {
    public void add(int iPosition, Object theElement);
    public void add(Object theElement);
    public Object get(int iPosition);
    public void remove(int iPosition);
    public boolean isEmpty();
    public int size();
    public void printList();
}
