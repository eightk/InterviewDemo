/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.lambdas.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author huico
 */
public class StreamDemo {

    public static void main(String args[]) {
        List<Person> ppl = Arrays.asList(
                new Person("Rich", "L", 30),
                new Person("Cip", "b", 50),
                new Person("Attila", "l", 35),
                new Person("Bob", "P", 45),
                new Person("Paul", "B", 55),
                new Person("Spencer", "H", 25)
        );
        //Print all the person with first name starts with R
        ppl.stream().filter(p -> p.getFirstName().startsWith("R")).forEach(System.out::println);
        System.out.println(ppl.stream().filter(p -> p.getAge() % 10 == 0).count());
    }
}
