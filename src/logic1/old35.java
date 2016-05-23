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
public class old35 {
  public static boolean module(int n){
  if(n%3==0 && n%5==0){
  return false;
  }  
    else
      if(n%3==0|| n%5==0)
      {
      return true;
      }
    return false;
    }
    public static void main(String ars[]){
 
    int a=12,b=15;
  
    System.out.println(module(b));
    
    
    }    
}
