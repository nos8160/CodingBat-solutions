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
public class love6 {
   public static boolean module(int a,int b){
       
       if(a==6 || b==6|| Math.abs(a-b)==6||a+b==6){
       return true;
       }
    
    
    return false;
    }
    public static void main(String ars[]){
 
    int a=-2,b=-4;
  
    System.out.println(module(a, b));
    
    
    }    
}
