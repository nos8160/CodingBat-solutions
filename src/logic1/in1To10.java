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
public class in1To10 {
    public static boolean inttoten(int i,boolean outsideMode){
  if(i>0 && i<11)
  {
  return true;
  }
    else
      if(i<2 || i>9 && outsideMode==true ){
      return true;
      }
    else
       return false;
    }
    public static void main(String str[]){
    
    boolean b=true;
    int i=11;
    System.out.println(inttoten(i, b));
    }
    
}
