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
public class sumLimit {
    public static int  module(int a,int b){
        int sum=String.valueOf(a+b).length();
        if(sum>String.valueOf(a).length()){
        return a;
        }
        
    
    
    
    return a+b;
    
    }
    public static void main(String ars[]){
    String s="";
    int a=8;
    int b=1;
        System.out.println(module(a,b));
    
}
}
