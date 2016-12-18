/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.lambdas.exercise;

import java.util.function.BiConsumer;

/**
 *
 * @author huico
 */
public class ExceptionHandleDemo {

    public static void main(String args[]) {
        int[] numbers = {1, 2, 3, 4};
        int key = 0;
        process(numbers, key, wrapperLambda((a, b) -> System.out.println(a / b)));
    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : numbers) {
            consumer.accept(i, key);
        }
    }

    //use wrapper lambda to handle exceptions.
    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (a, b) -> {
            try {
                consumer.accept(a, b);
            } catch (Exception ex) {
                System.out.println("Catch an exception in wrapperLambda");
            }
        };
    }
}
