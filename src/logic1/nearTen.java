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
public class nearTen {
  public static boolean module(int num){
    if(num%10<=2 || Math.abs(10-num%10)<=2)
    return true;
    else
    return false;
    }
    public static void main(String ars[]){
 
    int a=12,b=29;
  
    System.out.println(module(b));
    
    
    }    
}
