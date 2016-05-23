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
public class right2 {
  public static String name(String str){
 return str.substring(str.length()-2, str.length())+str.substring(0,  str.length()-2);
    }
    
public static void main(String arsg[]){

String s="hello";
    System.out.println(name(s));

}        
}
