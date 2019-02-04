/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urvish.arraysandstring.example1;

/**
 *
 * @author patelurv
 */
public class UniqueCharMethod5 {

    public static void main(String[] args) {
        String input = "urvish";
        System.out.println("Determine if a String has all unique character: " + findResult(input));

    }

    public static boolean findResult(String input) {
        int checker = 0;
        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i) - 'a';
            if ((checker & (1 << index)) > 0) {
                return false;
            }

            checker = checker | (1 << index);

        }
        return true;
    }

}
