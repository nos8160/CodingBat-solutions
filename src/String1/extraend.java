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
public class extraend {
      public static String name(String str){
    return str.substring(str.length()-2, str.length())+str.substring(str.length()-2, str.length())+str.substring(str.length()-2, str.length());
    }
    
public static void main(String arsg[]){

String s="bang";
    System.out.println(name(s));

}    
    
}
