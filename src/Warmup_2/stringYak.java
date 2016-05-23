/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup_2;

/**
 *
 * @author Lenovo
 */
public class stringYak {
public static String stringyak(String str){

      
return str.replaceAll("yak", "");
}
    public static void main(String arg[]){

String s="yakpak";
        System.out.println(stringyak(s));
}    
}
