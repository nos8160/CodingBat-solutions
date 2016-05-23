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
public class firsthalf {
  public static String firsthalf(String str){
    int half=str.length()/2;
    return str.substring(0, half);
    }
    
public static void main(String arsg[]){

String s="bang";
    System.out.println(firsthalf(s));

}    
    
    
    
}
