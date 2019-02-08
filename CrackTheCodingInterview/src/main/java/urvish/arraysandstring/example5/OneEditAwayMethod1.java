/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urvish.arraysandstring.example5;

/**
 *
 * @author patelurv
 */
public class OneEditAwayMethod1 {

    public static void main(String[] args) {
        String s1 = "google";
        String s2 = "ggle";
        if (isEditAwayOne(s1, s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isEditAwayOne(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if (Math.abs(m - n) > 1) {
            return false;
        }
        int i = 0, j = 0, count = 0;

        while (i < m && j < n) {
            if (s1.charAt(i) != s2.charAt(j)) {
                if (count == 1) {
                    return false;
                }

                if (m > n) {
                    i++;
                } else if (n > m) {
                    j++;
                } else {
                    i++;
                    j++;
                }
                count++;
            } else {
                i++;
                j++;
            }

        }
        if (i < m || j < n) {
            count++;
        }
        return count == 1;
    }

}
