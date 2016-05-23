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
public class inOrder {
   public static boolean module(int a,int b,int c,boolean bOk){
    if(bOk==true && b<c){return true;}
    else
    if(a<b && b<c){return true;}
    
    return false;
    }
    public static void main(String ars[]){
 
    int a=1,b=2,c=1;
  boolean d=false;
    System.out.println(module(a, b, c, d));
    
    
    }    
}
