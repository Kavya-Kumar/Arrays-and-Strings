import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Q1: isUnique: implement an algo to determine if a string has
 * all unique characters. What if you cannot use additional
 * data structures?
 * @author kavya
 *
 *  Assumptions:
 *  1. STring is ASCII chars. (If string is Unicode, then requires more storage)
 *  2. String length can't be more than 128 ASCII bits (or 256 for extended ASCII)
 *  
 */

public class q1 {

    private static boolean isUniqueChar(String str) {
        
        //assumption 2
        if (str.length() > 128)
            return false;
        
        //initialize array as false
        boolean[] charCheck = new boolean[128];
        
        //traverse string to store chars
        for (int i = 0; i < str.length(); i++) {
            
            int val = str.charAt(i);
            
            //if char is already present, return false for no unique chars.
            if (charCheck[val]) {
                return false;
            }
            charCheck[val] = true;
        }
        
        return true;
        
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        boolean check = isUniqueChar("abcdef");
        System.out.println(check);

    }

}
