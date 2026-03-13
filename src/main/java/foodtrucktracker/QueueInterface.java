/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package foodtrucktracker;

/**
 *Interface behind the behaviours for the Queue ADT.
 * @author Mridhula Vijayakumar
 */
public interface QueueInterface {
    public void enqueue(Object element);
    public Object dequeue();
    public Object frontElement();
    public boolean isEmpty();
    public int size();
    public String displayQueue();
}
