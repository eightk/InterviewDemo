/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.pie.ch8.sort.test;

import demo.pie.ch8.sort.SortUtils;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author huico
 */
public class sortTest {

    @Before
    public void init() {
        Integer[] array = {90, 12, 534, 1, 23, 6, 34, 653, 564, 3, 66, 67, 2};
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
    }

    @Test
    public void testSelectionSort() {
        System.out.print("Selection Sort ");
        printList(SortUtils.selectionSort(list, 0));
    }

    @Test
    public void testQuickSort() {
        System.out.print("Quick Sort ");
        printList(SortUtils.quickSort(list));
    }
    
    @Test
    public void testMergeSort() {
        System.out.print("Merge Sort ");
        printList(SortUtils.mergeSort(list));
    }

    private void printList(ArrayList<Integer> list) {
        System.out.print("Result: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    private ArrayList<Integer> list = new ArrayList();
}
