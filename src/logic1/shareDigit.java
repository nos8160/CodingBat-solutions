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
public class shareDigit {
public static boolean module(int a,int b){
    if(a/10==b/10|| a/10==b%10 || a%10==b/10 || a%10==b%10)
        return true;
    else
    return false;
    }
    public static void main(String ars[]){
//    String s="";
    int a=12,b=44;
        System.out.println(module(a, b));
        
}
}
