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
public class MathUtils
{
    public static double average(int a, int b)
    {
        return ((double)a + (double)b) / 2;
    }
    
    public static void main(String[] args)
    {
        System.out.println(average(0,1));
    }
}