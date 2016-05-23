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
public class stringsploision {
    public static String stringsploision(String str){
    String res="";
    for(int i=0;i<=str.length();i++){
    res=res+str.substring(0, i);
    }
    return res;
    }
   public static void main(String arsg[]){
   String s="code";
       System.out.println(stringsploision(s));
   
   
   } 
}
