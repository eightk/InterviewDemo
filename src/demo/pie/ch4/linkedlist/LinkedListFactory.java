/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.pie.ch4.linkedlist;

/**
 *
 * @author huico
 */
public class LinkedListFactory {
    
    public static ILinkedList getSinglyLinkedListInstance() {
        return new SinglyLinkedListProxy();
    }
    
    public static ILinkedList getDoublyLinkedListInstance() {
        return new DoublyLinkedListProxy();
    }
    
    public static ILinkedList getCircularLinkedListInstance() {
        return new CircularLinkedListProxy();
    }
    
    public static ILinkedList getStackInstance() {
        return new Stack();
    }
    
    
}
