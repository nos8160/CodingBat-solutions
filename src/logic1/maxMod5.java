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
public class maxMod5 {
 public static int  module(int a,int b){
    if(a==b){
    return 0;
    }
    else
    if(a%5==b%5)
    {
    return Math.min(a, b);
    }
    else
        return Math.max(a, b);
    }
    public static void main(String ars[]){
//    String s="";
    int a=12,b=45;
        System.out.println(module(a, b));    
}
}