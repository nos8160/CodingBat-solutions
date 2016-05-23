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
public class withoutend2 {
  public static String name(String str){
      if(str.length()<2)
          return str;
      else
    return str.substring(1, str.length()-1);
    }
    
public static void main(String arsg[]){

String s="bang";
    System.out.println(name(s));

}        
}
