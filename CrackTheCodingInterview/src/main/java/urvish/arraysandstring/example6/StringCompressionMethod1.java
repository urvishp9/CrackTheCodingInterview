/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urvish.arraysandstring.example6;

/**
 *
 * @author patelurv
 */
public class StringCompressionMethod1 {

    public static void main(String[] args) {
        String s = "aabcccdddd";
        System.out.print(getCompressedValue(s));
    }

    public static String getCompressedValue(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int counter = 1;
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    counter++;
                }
            }
            result.append(s.charAt(i)).append(counter);

            s = s.replaceAll(String.valueOf(s.charAt(i)), "");
        }

        return result.toString();
    }

}
