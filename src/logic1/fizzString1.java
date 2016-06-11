/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic1;

/**
 *
 * @author USER
 */
public class fizzString1 {
   public static String  module(String str){
   if(str.startsWith("f")&& str.endsWith("b")){
    return "FizzBuzz";
    
    }
       if(str.startsWith("f")){return "Fizz";}
    if(str.endsWith("b")){return "Buzz";}
   
    
    return str;
    }
    public static void main(String ars[]){
 
    String s="";
  
    System.out.println(module(s));
    
    
    }    
}
