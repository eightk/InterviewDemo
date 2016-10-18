/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.Nuance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author huico
 */
public class ValidationUtils {

    public static Boolean matchPattern(String value, String pattern) {

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(value);
        if (m.find()) {
            return true;
        } else {
            return false;
        }
    }

}
