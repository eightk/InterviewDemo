/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.pie.ch6.arrayandstring.test;

import demo.pie.ch6.arrayandstring.ArrayAndStringUtils;
import org.junit.Test;

/**
 *
 * @author huico
 */
public class ArrayAndStringTest {

    @Test
    public void findFirstRepeatCharTest() {
        System.out.println("First Duplicate character for 'requirement' is: " + ArrayAndStringUtils.findFirstRepeatChar("requirement"));
        System.out.println("First Duplicate character for 'sequences' is: " + ArrayAndStringUtils.findFirstRepeatChar("sequences"));
        System.out.println("First Duplicate character for 'abcd' is: " + ArrayAndStringUtils.findFirstRepeatChar("abcd"));
    }
    
    @Test
    public void removeCharacterTest() {
        System.out.println("Result of 'sequences' remove e is:" + ArrayAndStringUtils.removeCharacter("sequences", 'e'));
    }
    
    @Test
    public void reverseWordsTest() {
        System.out.println(ArrayAndStringUtils.reverseWords("I Love U!"));
    }
}
