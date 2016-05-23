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
public class twoAsOne {
   public static boolean module(int a,int b,int c){
    if(a+b==c || a+c==b || b+c==a)
    {return true;}
    return false;
    }
    public static void main(String ars[]){
 
    int a=3,b=2,c=2;
  
    System.out.println(module(a, b, c));
    
    
    }    
}
