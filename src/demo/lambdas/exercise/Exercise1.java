/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.lambdas.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author huico
 */
public class Exercise1 {

    public static void main(String args[]) {
        List<Person> ppl = Arrays.asList(
                new Person("Rich", "L", 30),
                new Person("Cip", "b", 50),
                new Person("Attila", "l", 35),
                new Person("Bob", "P", 45),
                new Person("Paul", "B", 55),
                new Person("Spencer", "H", 25)
        );

        //Sort List by last Name
        Collections.sort(ppl, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
        //print all elements in the list
        //printConditionally(ppl, p -> true, p -> System.out.println(p.toString()));
        printConditionally(ppl, p -> true, System.out::println);
        //print all ppl with last name begin with l
        System.out.println();
        printConditionally(ppl, p -> p.getLastName().startsWith("l"), p -> System.out.println(p.getFirstName()));

    }

    //There are a new set of functional interfaces added to JDK8 under java.util.function path
    private static void printConditionally(List<Person> list, Predicate<Person> p, Consumer<Person> consumer) {
        for (Person o : list) {
            if (p.test(o)) {
                consumer.accept(o);
            }
        }
    }
}
