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
public class PermutationMethod1 {
    
    
    public static void main(String[] args){
        String s1="aaca";
        String s2= "aca";
        System.out.println(arePermutation(s1,s2));
    }
    public static boolean arePermutation(String s1, String s2){
        int sizeS1 = s1.length();
        int sizeS2 = s2.length();
        
        if(sizeS1 != sizeS2){
            return false;
        }
        char ch1[]  = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
       for(int i=0;i<ch1.length;i++){
           if(ch1[i] != ch2[i]){
               return false;
           }
       }
        return true;
        
    }
    
}
