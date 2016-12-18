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
public class TypeInferenceDemo {

    public static void main(String args[]) {
        //for only one variable we can make the expression like this: remove the () and String type.
        //StringLengthLambda myLambda = s -> s.length();
        //System.out.println(myLambda.getLength("Hello!"));
        //can even put the lambda expression as part of the variable, because it is an object so can be put into the other method.
        printLambda(s -> s.length(), "Hello!");
    }
    
    public static void printLambda(StringLengthLambda l, String s) {
        System.out.println(l.getLength(s));
    }

    interface StringLengthLambda {

        int getLength(String s);
    }
}
