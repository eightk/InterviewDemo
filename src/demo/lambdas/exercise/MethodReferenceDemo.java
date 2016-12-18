/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.lambdas.exercise;

/**
 *
 * @author huico
 */
public class MethodReferenceDemo {
    public static void main(String args[]) {
        //use the method reference to replace () -> printMessage()
        Thread t = new Thread(MethodReferenceDemo::printMessage);
        t.start();
    }
    
    private static void printMessage() {
        System.out.println("Hello!");
    }
}
