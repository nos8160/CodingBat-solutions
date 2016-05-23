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
public class lessBy10 {
      public static boolean module(int a,int b,int c){
    if(Math.abs(a-b)>9 || Math.abs(c-b)>9 ||Math.abs(a-c)>9)
    return true;
    else
        return false;
      }
    public static void main(String ars[]){
 
    int a=12,b=4,c=0;
  
    System.out.println(module(a, b, c));
    
    
    }
    
}
