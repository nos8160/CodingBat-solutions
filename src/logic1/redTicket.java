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
public class redTicket {
 public static int module(int a,int b,int c){
     
 if(a==2 &&b==2 &&c==2){
     
     return 10;
 }
  else
     if(a==b && b==c){
         
         return 5;
     }
    if(b!=a && c!=a)
    {
     return 1;   
    }
    
return 0;
 }
    public static void main(String ars[]){
//    String s="";
    int a=2,b=2,c=1;
        System.out.println(module(a, b, c));    
}
}