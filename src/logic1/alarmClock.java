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
public class alarmClock {
   public static String module(int day,boolean vacation){
       if(vacation==false){
       if(day>0){return "7.00";}
       if(day==0){return "10.00";}
       }
       else
           if(day==0){return "off";}
       if(day>0){return "10.00";}
    
    return "";
    }
    public static void main(String ars[]){
 
    int a=0;
    boolean b=false;
  
    System.out.println(module(a, b));
    
    
    }    
}
