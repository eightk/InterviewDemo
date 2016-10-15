/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.dematic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author huico
 */
public class PasswordValidation {

    public static Boolean strongPassword(String password) {
        if (password.length() < 12) {
            return false;
        }
        
        if(password.contains("123")) {
            return false;
        }
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(password);
        if (m.find()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(strongPassword("Strong1Password")); // Strong password
        System.out.println(strongPassword("strong1password")); // Weak password
        System.out.println(strongPassword("Strong123Password"));
    }
}
