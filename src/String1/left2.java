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
public class left2 {
  public static String left2(String str){
  
      return str.substring(2, str.length())+str.substring(0, 2);
    }
    
public static void main(String arsg[]){

String s="java";
    System.out.println(left2(s));

}    
    
    
}
