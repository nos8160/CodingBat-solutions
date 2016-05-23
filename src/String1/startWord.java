/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String1;

/**
 *
 * @author USER
 */
public class startWord {

    public static String starword(String str,String word){
 if(str.length()<1 || (str.length()<word.length()))
            return "";
  
        if(word.substring(1).equals(str.substring(1, word.length())))
            return str.substring(0, word.length());
 else
            return "";
 


    }
    public static void main(String args[]){
String s="h";
String ss="ix";
        System.out.println(starword(s, ss));
    
    }    
}
