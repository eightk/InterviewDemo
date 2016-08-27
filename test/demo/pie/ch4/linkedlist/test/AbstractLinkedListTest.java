/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.pie.ch4.linkedlist.test;

import demo.pie.ch4.linkedlist.ILinkedList;
import org.junit.Test;

/**
 *
 * @author huico
 */
public class AbstractLinkedListTest {

    @Test
    public void testInsert() {
        ll.insertInBetween(99, 5);
        System.out.print("Insert at 5th place success: ");
        ll.printList();
        ll.insertToHead(98);
        System.out.print("Insert to head success: ");
        ll.printList();
        ll.insertToTail(97);
        System.out.print("Insert to tail success: ");
        ll.printList();
    }

    @Test
    public void testDelete() {
        ll.deleteFromTail();
        System.out.print("Delete from tail success: ");
        ll.printList();
        ll.deleteFromHead();
        System.out.print("Delete from head success: ");
        ll.printList();
        ll.deleteInBetween(5);
        System.out.print("Delete from 5th place success: ");
        ll.printList();
    }

    @Test
    public void testSort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ILinkedList getLl() {
        return ll;
    }

    public void setLl(ILinkedList ll) {
        this.ll = ll;
    }
    
    private ILinkedList ll;
}
