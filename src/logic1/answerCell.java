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
public class answerCell {
       public static boolean module(boolean isMorning,boolean isMom,boolean isAsleep
       ){
           if(isAsleep==true){return false;}
           if(isMorning==true && isMom==false){return false;}
    
    
    return true;
    }
    public static void main(String ars[]){
 
    boolean a = true,b = false,c = false;
  
    System.out.println(module(a, b, c));
    
    
    }
    
}
