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
public class squirellPlay {
  public static boolean module(int temp,boolean isSummer){
      if(temp>59 && temp<91 && isSummer==false){
      return true;
      
      }
      else
          if(temp>59 && temp<101 && isSummer==true){
          return true;
          }
    
    
    return false;
    }
    public static void main(String ars[]){
 
    int a=12,b=70;
  
    System.out.println(module(b, false));
    
    
    }    
}
