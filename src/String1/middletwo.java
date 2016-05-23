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
public class middletwo {
    
  public static String name(String str){
      int mid=str.length()/2;
    return str.substring(mid-1, mid+1);
    }
    
public static void main(String arsg[]){

String s="banggo";
    System.out.println(name(s));

}    
}
