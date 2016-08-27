/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.pie.ch4.linkedlist;

import java.util.ArrayList;

/**
 *
 * @author huico
 */
public class SinglyLinkedListProxy extends AbstractLinkedList {

    @Override
    public void init(int[] initValues) {
        ArrayList<ListElement> allElements = new ArrayList();
        for (int i = 0; i < initValues.length; i++) {
            ListElement newElement = new ListElement();
            newElement.setValue(initValues[i]);
            if (i == 0) {
                this.setHead(newElement);
            }
            allElements.add(newElement);
            //set the next element
            if (i > 0) {
                (allElements.get(i - 1)).setNext(newElement);
            }
        }
    }

    /* Note: need to handle the head separately*/
    @Override
    public void insertInBetween(int data, int insertPoint) {
        if (insertPoint > getSize() || insertPoint < 1) {
            System.out.println("Invalid insert Point, Please use insert point between 1 and " + getSize());
            return;
        }
        ListElement newElement = new ListElement();
        newElement.setValue(data);
        ListElement curElement = getHead();
        ListElement preElement = curElement;
        for (int i = 0; i < insertPoint - 1; i++) {
            preElement = curElement;
            curElement = curElement.getNext();
        }
        if (preElement.equals(curElement) && curElement.equals(getHead())) {
            newElement.setNext(getHead());
            setHead(newElement);
        } else {
            if (preElement != null) {
                preElement.setNext(newElement);
            }
            newElement.setNext(curElement);
        }
    }

    /* Note: need to handle the head separately*/
    @Override
    public void deleteInBetween(int deletePoint) {
        if (deletePoint > getSize() || deletePoint < 1) {
            System.out.println("Invalid delete Point, Please use delete point between 1 and " + getSize());
            return;
        }
        ListElement curElement = getHead();
        ListElement preElement = curElement;
        for (int i = 0; i < deletePoint - 1; i++) {
            preElement = curElement;
            curElement = curElement.getNext();
        }
        if (preElement.equals(curElement) && curElement.equals(getHead())) {
            setHead(getHead().getNext());
        } else {
            preElement.setNext(curElement.getNext());
        }
    }

    @Override
    public void sort(boolean isAscending) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
