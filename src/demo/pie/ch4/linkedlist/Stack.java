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
public class Stack extends SinglyLinkedListProxy {
    
    public void push(int data) {
        insertToHead(data);
    }
    
    public ListElement pop() {
        ListElement result = getHead();
        deleteFromHead();
        return result;
    }
}
