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
public class caughtSpeeding {
  public static int module(int speed,boolean isBirthday){
     if(isBirthday==false) {if(speed<61){return 0;}
    if(speed>60 && speed<81){return 1;}
    if(speed>81){return 2;}}
    else
     {if(isBirthday==true){
    
    if(speed-5<61){return 0;}
    if(speed-5>60 && speed-5<81){return 1;}
    if(speed-5>81){return 2;}
    
    }
  }   return 0;
}
    
    public static void main(String ars[]){
 
    int a=12,b=4;
  
    System.out.println();
    
    
    }    
}
