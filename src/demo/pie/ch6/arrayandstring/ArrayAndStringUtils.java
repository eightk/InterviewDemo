/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.pie.ch6.arrayandstring;

import java.util.Hashtable;

/**
 *
 * @author huico
 */
public class ArrayAndStringUtils {

    public static Character findFirstRepeatChar(String input) {
        Hashtable<Character, Integer> table = new Hashtable();
        for (int i = 0; i < input.length(); i++) {
            Character c = input.toCharArray()[i];
            Integer result = table.get(c);
            if (result == null) {
                table.put(c, 1);
            } else {
                table.replace(c, table.get(c) + 1);
                return c;
            }
        }
        return null;
    }

    public static String removeCharacter(String input, Character c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            Character currentChar = input.toCharArray()[i];
            if (!currentChar.equals(c)) {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }

    public static String reverseWords(String input) {
        StringBuilder sb = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            Character c = input.toCharArray()[i];
            if (!c.equals(' ')) {
                currentWord.append(c);
            } else {
                sb.insert(0, currentWord).insert(0, ' ');
                currentWord = new StringBuilder();
            }
        }
        sb.insert(0, currentWord);
        return sb.toString();
    }
}
