/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urvish.arraysandstring.firstexample;

/**
 *
 * @author patelurv
 */
public class UniqueCharMethod2 {

    public static void main(String args[]) {
        String input = "Urvish";

        if (uniqueCharacters(input)) {
            System.out.println("The String " + input + " has all unique characters");
        } else {
            System.out.println("The String " + input + " has duplicate characters");
        }
    }

    public static boolean uniqueCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

}
