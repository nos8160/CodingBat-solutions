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
public class theend {
  public static String name(String str,boolean front){
  if(front==true)
      return str.substring(0, 1);
  else
      return str.substring(str.length()-1);
      
    }
    
public static void main(String arsg[]){

String s="heollo";
boolean b=false;
    System.out.println(name(s, b));

}        
}
