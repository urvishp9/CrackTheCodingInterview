/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urvish.arraysandstring.example3;

/**
 *
 * @author patelurv
 */
public class URLifyMethod1 {

    private static char[] replaceSpaceInString(char[] str, int length) {
        int spaceCounter = 0;

        //First lets calculate number of spaces
        for (int i = 0; i < length; i++) {
            if (str[i] == ' ') {
                spaceCounter++;
            }
        }

        //calculate new size
        int newLength = length + 2 * spaceCounter;

        char[] newArray = new char[newLength + 1];
        newArray[newLength] = '\0';

        int newArrayPosition = 0;

        for (int i = 0; i < length; i++) {
            if (str[i] == ' ') {
                newArray[newArrayPosition] = '%';
                newArray[newArrayPosition + 1] = '2';
                newArray[newArrayPosition + 2] = '0';
                newArrayPosition = newArrayPosition + 3;
            } else {
                newArray[newArrayPosition] = str[i];
                newArrayPosition++;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        char[] array = "urvish patel  ".toCharArray();
        System.out.println(replaceSpaceInString(array, array.length));
    }
}
