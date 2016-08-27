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
public interface ILinkedList {
    
    public void init(int[] initValues);
    public void printList();
    public void insertToHead(int data);
    public void insertToTail(int data);
    public void insertInBetween(int data, int insertPoint);
    public void deleteFromHead();
    public void deleteFromTail();
    public void deleteInBetween(int deletePoint);
    public int getSize();    
    public void sort(boolean isAscending);
}
