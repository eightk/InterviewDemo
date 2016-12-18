/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.lambdas.exercise;

import java.util.function.IntConsumer;

/**
 *
 * @author huico
 */
public class ClosureDemo {

    public static void main(String args[]) {
        int a = 10;
        //No longer need to put a final here because it is considered to be effectively final
        int b = 15;
        process(a, i -> System.out.println(i + b));
    }

    private static void process(int i, IntConsumer consumer) {
        consumer.accept(i);
    }
}
