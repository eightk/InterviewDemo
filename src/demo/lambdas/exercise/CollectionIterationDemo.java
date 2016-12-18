/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.lambdas.exercise;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author huico
 */
public class CollectionIterationDemo {

    public static void main(String args[]) {
        List<Person> ppl = Arrays.asList(
                new Person("Rich", "L", 30),
                new Person("Cip", "b", 50),
                new Person("Attila", "l", 35),
                new Person("Bob", "P", 45),
                new Person("Paul", "B", 55),
                new Person("Spencer", "H", 25)
        );
        //ppl.forEach(p -> System.out.println(p));
        ppl.forEach(System.out::println);
    }
}
