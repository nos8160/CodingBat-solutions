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
public class fizzString {
  public static String module(int n){
    if(n%3==0){return "Fizz!";}
    if(n%5==0){return "Buzz!";}
    if(n%3==0 && n%5==0 ){return "FizzBuzz!";}
    else
    
    return ""+n+""+"!";
    }
    public static void main(String ars[]){
 
    int a=12,b=4;
  
    System.out.println(module(b));
    
    
    }    
}
