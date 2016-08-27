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
public abstract class AbstractLinkedList implements ILinkedList {

    @Override
    public void printList() {
        ListElement curElement = this.getHead();
        while (curElement.getNext() != null && !curElement.getNext().equals(getHead())) {
            System.out.print(curElement.getValue() + " ");
            curElement = curElement.getNext();
        }
        System.out.println();
    }

    @Override
    public void insertToHead(int data) {
        insertInBetween(data, 1);
    }

    @Override
    public void insertToTail(int data) {
        insertInBetween(data, getSize());
    }

    @Override
    public void deleteFromHead() {
        deleteInBetween(1);
    }

    @Override
    public void deleteFromTail() {
        deleteInBetween(getSize());
    }

    @Override
    public int getSize() {
        ListElement curElement = head;
        int count = 1;
        if (head == null) {
            return 0;
        }
        while (curElement.getNext() != null && !curElement.getNext().equals(head)) {
            curElement = curElement.getNext();
            count++;
        }
        return count;
    }

    public ListElement getHead() {
        return head;
    }

    public void setHead(ListElement head) {
        this.head = head;
    }

    private ListElement head;

}
