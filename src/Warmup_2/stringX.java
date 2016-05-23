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
public class stringX {

    public static String stringx(String str){
    String result = "";
  for (int i=0; i<str.length(); i++) {
  
   if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
      result = result + str.substring(i, i+1); 
    }
  }
  return result;
    }
 
    
    
    public static void main(String args[]){
String s="xaxsxxdfsfx";
        System.out.println(stringx(s));
}    
}
