/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String1;

/**
 *
 * @author Lenovo
 */
public class lastChars {
public static String name(String a,String b){
    if(a.length()==0 ||b.length()==0){
    String as=a+"@";
    String bs="@"+b;
    return as.substring(0, 1)+bs.substring(bs.length()-1, bs.length());
    }
    return a.substring(0, 1)+b.substring(b.length()-1, b.length());
    }
    
public static void main(String arsg[]){

String s="asd";
String b="asfd";
    System.out.println(name(s, b));

}       
}
