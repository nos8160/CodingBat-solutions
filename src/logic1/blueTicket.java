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
public class blueTicket {
     public static int module(int a,int b,int c){
         int ab=a+b;
         int bc=b+c;
         int ca=c+a;
         if(ab==10||bc==10||ca==10)
         {
         return 10;
         }
         else
             if(ab-bc==10 || ab-ca==10){
             return 5;}
    
    
    return 0;
    }
    public static void main(String ars[]){
//    String s="";
    int a=6,b=1,c=4;
        System.out.println(module(a, b, c));
    
}
}
