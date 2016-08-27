/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.pie.ch4.linkedlist.test;

import demo.pie.ch4.linkedlist.LinkedListFactory;
import org.junit.Before;

/**
 *
 * @author huico
 */
public class SinglyLinkedListTest extends AbstractLinkedListTest {

    @Before
    public void init() {
        setLl(LinkedListFactory.getSinglyLinkedListInstance());
        getLl().init(new int[] {66,8,6,55,1,46,28,94,76,888});
        System.out.print("Init success: ");
        getLl().printList();
    }
}
