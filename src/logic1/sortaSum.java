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
public class sortaSum {
  public static int module(int a,int b){
    if(a+b>9 && a+b<20){
    return 20;
    }
    
    return a+b;
    }
    public static void main(String ars[]){
 
    int a=10,b=11;
  
    System.out.println(module(a, b));
    
    
    }    
}
