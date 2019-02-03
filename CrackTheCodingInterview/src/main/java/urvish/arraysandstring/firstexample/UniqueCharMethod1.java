/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urvish.arraysandstring.firstexample;

import java.util.HashSet;

/**
 *
 * @author patelurv
 */
public class UniqueCharMethod1 {

    public static void main(String[] args) {
        boolean result = false;
        String inputStr = "urvish";
        HashSet<Character> uniqueChar = new HashSet();
        for (int i = 0; i < inputStr.length(); i++) {
            result = uniqueChar.add(inputStr.charAt(i));
            if (result == false) {
                break;
            }
        }
        System.out.println(result);
    }

}
