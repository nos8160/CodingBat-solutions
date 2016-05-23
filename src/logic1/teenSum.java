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
public class teenSum {
  public static int module(int a,int b){
if(a+b>12&&a+b<20){
return 19;
}     
    else
    return a+b;
    }
    public static void main(String ars[]){
 
    int a=13,b=2;
  
    System.out.println(module(a, b));
    
    
    }    
}
