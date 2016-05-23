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
public class specialEleven {
  public static boolean module(int n){
if(n%11==0 || n%11==1){return true;}    
    else
    return false;
    }
    public static void main(String ars[]){
 
    int a=12,b=24;
  
    System.out.println(module(b));
    
    
    }    
}
