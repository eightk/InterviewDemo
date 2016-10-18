/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.Nuance;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author huico
 */
public class validationTest {

    @Test
    public void testMatchPattern() {
        String pattern = "(^[k-kK-K1-8]{1})(\\d{4})$";
        String successTest1 = "k1234";
        String successTest2 = "30000";
        String successTest3 = "K0000";
        String failedTest1 = "390000";//Too long
        String failedTest2 = "a1456";//Invalid grade
        String failedTest3 = "5145";//Too short

        assertTrue(ValidationUtils.matchPattern(successTest1, pattern));
        assertTrue(ValidationUtils.matchPattern(successTest2, pattern));
        assertTrue(ValidationUtils.matchPattern(successTest3, pattern));
        assertFalse(ValidationUtils.matchPattern(failedTest1, pattern));
        assertFalse(ValidationUtils.matchPattern(failedTest2, pattern));
        assertFalse(ValidationUtils.matchPattern(failedTest3, pattern));
    }

}
