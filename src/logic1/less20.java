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
public class less20 {
   public static boolean module(int n){
if((n+1)%20==0 ||(n+2)%20==0){
return true;
}    
    else
    return false;
    }
    public static void main(String ars[]){
 
    int a=12,b=1023;
  
    System.out.println(module(b));
    
    
    }    
}
