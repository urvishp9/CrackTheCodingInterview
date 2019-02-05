/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urvish.arraysandstring.example2;

import java.util.Arrays;

/**
 *
 * @author patelurv
 */
public class PermutationMethod2 {

    static int NO_OF_CHARS = 256;

    public static void main(String[] args) {
        char str1[] = ("urvishpatel").toCharArray();
        char str2[] = ("patelurvish").toCharArray();
        boolean result = arePermutation(str1, str2);
        System.out.println(result);
    }

    public static boolean arePermutation(char str1[], char str2[]) {
        int count1[] = new int[NO_OF_CHARS];
        int count2[] = new int[NO_OF_CHARS];
        Arrays.fill(count1, 0);
        Arrays.fill(count2, 0);
        int i;
        for (i = 0; i < str1.length & i < str2.length; i++) {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }

        if (str1.length != str2.length) {
            return false;

        }

        for (i = 0; i < NO_OF_CHARS; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

}
