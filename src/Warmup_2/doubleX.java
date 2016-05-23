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
public class doubleX {
 public static boolean doublex(String str){
 int i=str.indexOf('x');
 
 if( i<str.length()-1 &&i>=0 && str.charAt(i+1)=='x')
     return true;
 else
     return false;
 }   
    public static void main(String args[]){
String s="sbx";
System.out.println(doublex(s));
}
}
