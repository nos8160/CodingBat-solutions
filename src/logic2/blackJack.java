/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic2;

/**
 *
 * @author nazrul
 */
public class blackJack {
    public static int blackJack(int a, int b){
   if(a<22 && b<22){
       if(a>b)
           return a;
       else
           return b;
   }
   if(a<22 && b>21)
       return a;
   if(a>21 && b<22)
       return b;
    else
       return 0;
    }
    public static void main(String[] args) {
        int a=5,b=8;
        System.out.println(blackJack(a, b));
    }
    
}
