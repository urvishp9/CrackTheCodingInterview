/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urvish.arraysandstrings.example9;

/**
 *
 * @author patelurv
 */
public class StringRotation {

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        System.out.print(isSubString(s1, s2));
    }

    public static boolean isSubString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String s = s1 + s1;

        return s.contains(s2);
    }

}
