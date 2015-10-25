/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pete.ui;

/**
 *
 * @author schirmer
 */
public class StringUtil {
    
    public static String pad(String s, int length) {
        if (s.length() < length) {
            // append spaces until the string is the specified length
            StringBuilder sb = new StringBuilder(s);
            while (sb.length() < length) {
                sb.append(" ");
            }
            return sb.toString();
        } else {
            //truncate the string to the specified length
            return s.substring(0,length);
        }
    }
}
