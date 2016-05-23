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
public class altpairs {
    
public static String altpairs(String str){
String s="";
for(int i=0;i<str.length();i+=4){

s=s+str.substring(i, Math.min(str.length(), i+2));

}
return s;
}

    
public static void main(String arsg[]){

String s="cs";
    System.out.println(altpairs(s));

}
}
