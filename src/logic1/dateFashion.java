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
public class dateFashion {
   public static int module(int you,int date){
    if(you>7 && date>2 || you>2 && date>7)
    {
    return 2;
    }
    if(you<3 && date<8 || date<3 && you<8){
    return 0;
    }
    
    return 1;
    }
    public static void main(String ars[]){
 
    int a=12,b=2;
  
    System.out.println(module(a, b));
    
    
    }    
}
