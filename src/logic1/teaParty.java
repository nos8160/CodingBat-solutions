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
public class teaParty {
   public static int module(int tea,int candy){
       if(tea>4 && candy>4){
       if(tea*2<=candy || candy*2<=tea){
       return 2;
       }else
           return 1;
       
       }
       if(tea<5 || candy<5){return 0;}
     
    
    
    return 2;
    }
    public static void main(String ars[]){
 
    int a=20,b=6;
  
    System.out.println(module(a, b));
    
    
    }    
}
