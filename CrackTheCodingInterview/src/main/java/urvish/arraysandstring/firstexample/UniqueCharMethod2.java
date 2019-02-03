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

    public static void main(String[] args) {
        String inputStr = "urvish";
        System.out.println("Determine if a String has all unique character: " + findResult(inputStr));
    }

    public static boolean findResult(String input) {

        for (int i = 0; i < input.length(); i++) {
            int count = 0;
            char firstChar = input.charAt(i);

            for (int j = i; j < input.length(); j++) {
               
                if (firstChar == input.charAt(j)) {
                    count++;
                }
            } 
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
