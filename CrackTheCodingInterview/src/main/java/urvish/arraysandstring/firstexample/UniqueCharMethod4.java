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
public class UniqueCharMethod4 {

    public static void main(String[] args) {
        String inputStr = "urvish";
        System.out.println("Determine if a String has all unique character: " + findResult(inputStr));
    }

    public static boolean findResult(String input) {
        boolean result = false;
        for (char ch : input.toCharArray()) {
            if (input.indexOf(ch) == input.lastIndexOf(ch)) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;

    }

}
