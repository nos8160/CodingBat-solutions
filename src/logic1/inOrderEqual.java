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
public class inOrderEqual {
  public static boolean module(int a,int b,int c,boolean equalOk){
   if(equalOk==true && c>=b && b>=a)
       return true;
   if(equalOk==false && c>b && b>a)
       return true;
   else
       return false;
    }
    public static void main(String ars[]){
 
    int a=12,b=4,c=4;
  
    System.out.println(module(a, b, c, true));
    
    
    }    
}
