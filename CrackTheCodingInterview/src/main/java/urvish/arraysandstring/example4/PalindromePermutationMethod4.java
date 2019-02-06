/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urvish.arraysandstring.example4;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author patelurv
 */
public class PalindromePermutationMethod4 {
      public static void main(String[] args) {
        System.out.print(canPermutePalindrome("aac"));
    }

    public static boolean canPermutePalindrome(String s) {
        Set < Character > set = new HashSet < > ();
        for (int i = 0; i < s.length(); i++) {
            if (!set.add(s.charAt(i)))
                set.remove(s.charAt(i));
        }
        return set.size() <= 1;
    }
}
