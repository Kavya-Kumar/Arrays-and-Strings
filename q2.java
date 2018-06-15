/**
 * Q2: checkPermutation: Given two strings, write a method to decide if one
 * is a permutation of  the other.
 * @author kavya
 *
 *  Assumptions:
 *  1. Consider the comparison of strings as case sensitive.
 *  2. Consider that whitespace is significant. eg: "God  " is different
 *  from "dog".
 *  3. if length of the two strings is different, then obviously 
 *  the strings cannot be permutations of each other. 
 */
public class q2 {

    //first sort the two strings. 
    //Sorting will place the chars equally.
    private static String sortString(String str) {
        
        char[] sorted = str.toCharArray();
        java.util.Arrays.sort(sorted);
        return new String(sorted);
    }
    
    //method for checking permutations.
    private static boolean checkPermutation(String str1, String str2) {
        
        //assumption1
        if (str1.length() != str2.length()) {
            return false;
        }
        
        //boolean check if sorted strings are equal.
        boolean check = sortString(str1).equals(sortString(str2));
        
        return check;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String str1 = "God  ";
        String str2 = "doG  ";
        
        System.out.println(checkPermutation(str1, str2));
    }

}
