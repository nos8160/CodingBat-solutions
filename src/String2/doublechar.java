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
public class doublechar {
    public static String name(String str){
String s="";
        
for(int i=0;i<2;i++){
  s=s+str.charAt(i)+""+str.charAt(i);
}
  return s;      
}

public static void main(String arsg[]){
String s="";
    System.out.println(name(s));



}

    
}
