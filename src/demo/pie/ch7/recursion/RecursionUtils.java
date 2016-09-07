/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.pie.ch7.recursion;

/**
 *
 * @author huico
 */
public class RecursionUtils {

    public static int factorialCalRec(int value) {
        if (value <= 0) {
            return 0;
        }
        if (value > 1) {
            return value * factorialCalRec(value - 1);
        } else {
            return 1;
        }
    }

    //accending sorted array binary search
    public static int binarySearchRec(int[] array, int searchNum) {
        return binarySearchRec(array, searchNum, 0, array.length - 1);

    }

    private static int binarySearchRec(int[] array, int searchNum, int startPoint, int endPoint) {
        int comparePoint = (endPoint + startPoint) / 2;
        int compareValue = array[comparePoint];
        if (startPoint == endPoint && searchNum != compareValue) {
            return -1;
        }
        //To prevent the endPoint = startPoint + 1 and stuck forever problem
        if (compareValue > searchNum) {
            return binarySearchRec(array, searchNum, startPoint, comparePoint - 1);
        }
        if (compareValue < searchNum) {
            return binarySearchRec(array, searchNum, comparePoint + 1, endPoint);
        }
        return comparePoint;
    }

    public static void stringPermutation(String in, StringBuilder out, boolean[] used) {
        for (int i = 0; i < in.length(); i++) {
            if (in.length() == out.length()) {
                System.out.print(out.toString() + " ");
                return;
            }
            StringBuilder newout = new StringBuilder().append(out.toString());
            boolean[] newused = new boolean[in.length()];
            for (int j = 0; j < used.length; j++) {
                newused[j] = used[j];
            }
            if (newused[i]) {
                continue;
            }
            newout.append(in.charAt(i));

            newused[i] = true;
            stringPermutation(in, newout, newused);
        }
    }

    public static void stringCombination(String in, StringBuilder out, int startPoint) {
        for (int i = startPoint; i < in.length(); i++) {
            StringBuilder newout = new StringBuilder().append(out.toString());
            newout.append(in.charAt(i));
            System.out.print(newout.toString() + " ");
            stringCombination(in, newout, i + 1);
        }
    }
}
