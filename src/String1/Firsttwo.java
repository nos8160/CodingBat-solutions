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
public class Firsttwo {
  public static String firstTwo(String str){
    if(str.length()<3)
        return str;
    else
        return str.substring(0, 2);
    }
    
public static void main(String arsg[]){

String s="bang";
    System.out.println(firstTwo(s));

}        
}
