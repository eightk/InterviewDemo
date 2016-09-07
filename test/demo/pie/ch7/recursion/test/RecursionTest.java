/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.pie.ch7.recursion.test;

import demo.pie.ch7.recursion.RecursionUtils;
import org.junit.Test;

/**
 *
 * @author huico
 */
public class RecursionTest {

    @Test
    public void testFactorial() {
        System.out.println("5! = " + RecursionUtils.factorialCalRec(5));
        System.out.println("7! = " + RecursionUtils.factorialCalRec(7));
    }

    @Test
    public void testBinarySearch() {
        int[] array = {0, 2, 4, 12, 23, 34, 56, 78, 90, 100, 209, 304, 499, 1024};
        System.out.println("# 1024 at position: " + RecursionUtils.binarySearchRec(array, 1024));
        System.out.println("# 0 at position: " + RecursionUtils.binarySearchRec(array, 0));
        System.out.println("# 99 at position: " + RecursionUtils.binarySearchRec(array, 99));
    }

    @Test
    public void testStringPermutation() {
        System.out.println("Permutation:");
        RecursionUtils.stringPermutation("abcd", new StringBuilder(), new boolean[4]);
        System.out.println();
    }

    @Test
    public void testStringCombination() {
        System.out.println("Combination:");
        RecursionUtils.stringCombination("abcd", new StringBuilder(), 0);
        System.out.println();
    }
}
