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
public class makeabba {

     public static String name(String a,String b){

         return a.concat(b).concat(b).concat(a);
    }
    
public static void main(String arsg[]){

String s1="hi";
String s2="bye";
    System.out.println(name(s1, s2));

}    
    
    
    
    
}
