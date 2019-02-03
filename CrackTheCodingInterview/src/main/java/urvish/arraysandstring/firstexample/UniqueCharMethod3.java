/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urvish.arraysandstring.firstexample;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author patelurv
 */
public class UniqueCharMethod3 {

    public static void main(String[] args) {
        String inputStr = "urvish";
        System.out.println("Determine if a String has all unique character: " + findResult(inputStr));
    }

    public static boolean findResult(String input) {
        ArrayList arrChar;
        arrChar = new ArrayList();
        for (int i = 0; i < input.length(); i++) {
            arrChar.add(input.charAt(i));
        }
        Collections.sort(arrChar);

        for (int i = 0; i < (arrChar.size() - 1); i++) {
            if (arrChar.get(i) == arrChar.get(i + 1)) {
                return false;
            }
        }
        return true;

    }

}
