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
public class LambdaExpressionDemo {

    public static void main(String args[]) {
        //Interface declare lambda expression should have only one method
        //It creates a lambda function inline.
        VoidFunctionIF printFunction = () -> {
            System.out.println("Hello!");
        };
        //Lambda function is similar to a shortcut of creating a new inner class but it will not create an extra class file.
        VoidFunctionIF temp = new VoidFunctionIF() {
            @Override
            public void perform() {
                System.out.println("Hello!");
            }
        };
        printFunction.perform();
        temp.perform();
    }
}
