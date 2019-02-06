/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urvish.arraysandstring.example4;

/**
 *
 * @author patelurv
 */
public class PalindromePermutationMethod1 {

    public static void main(String[] args) {
        System.out.print(canPermutePalindrom("aac"));
    }

    public static boolean canPermutePalindrom(String s) {
        int count = 0;
        for (int i = 0; i < 128 && count <= 1; i++) {
            int ct = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == i) {
                    ct++;
                }

            }
            count += ct % 2;
        }
        return count <= 1;
    }
}
