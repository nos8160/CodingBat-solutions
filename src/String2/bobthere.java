/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String_2;

/**
 *
 * @author USER
 */
public class bobthere {
    public static boolean name(String str){
     boolean b=false;
        for(int i=0;i<str.length()-2;i++){
  if(str.charAt(i)=='b' && str.charAt(i+2)=='b')
      b=true;
  
      }
        return b;
}

public static void main(String arsg[]){
String s="b9b";
    System.out.println(name(s));



}

    
}
