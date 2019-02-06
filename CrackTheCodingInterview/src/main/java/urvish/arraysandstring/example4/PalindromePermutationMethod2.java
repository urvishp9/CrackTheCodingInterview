/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urvish.arraysandstring.example4;

import java.util.HashMap;

/**
 *
 * @author patelurv
 */
public class PalindromePermutationMethod2 {

    public static void main(String[] args) {
        System.out.print(canPermutePalindrome("aac"));
    }

    public static boolean canPermutePalindrome(String s) {
        HashMap< Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int count = 0;
        for (char key : map.keySet()) {
            count += map.get(key) % 2;
        }
        return count <= 1;
    }
}
