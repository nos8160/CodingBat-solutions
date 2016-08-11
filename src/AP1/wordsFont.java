/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP1;

import java.util.Arrays;

/**
 *
 * @author nazrul
 */
public class wordsFont {
    public static String[] wordsFont(String[] words, int n){
    String[] s=new String[n];
        for(int i=0;i<n;i++){
       s[i]=words[i];    
    }
    return s;
    }
    public static void main(String[] args) {
        String str[]=new String[]{"sadf","ter"};
        System.out.println(Arrays.toString(wordsFont(str, 1)));
    }
    
}
