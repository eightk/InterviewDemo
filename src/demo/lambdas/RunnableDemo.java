/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.lambdas;

/**
 *
 * @author huico
 */
public class RunnableDemo {

    public static void main(String args[]) {
        Thread myLambdaThread = new Thread(() -> System.out.println("Print inside lambda runnable."));
        myLambdaThread.run();
    }
}
