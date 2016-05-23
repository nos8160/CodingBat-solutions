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
public class plusout {

    public static String name(String str,String word){
  if(str.contains(word)){
str=str.replace(word,"**");
for(int i=0;i<str.length();i++){
if(str.charAt(i)!='*')
str=str.replace(str.substring(i,i+1),"+");
}
}
str=str.replace("**",word);
return str;
    }

public static void main(String arsg[]){
String s="abYabcXYZ";
String word="YZ";
    System.out.println(name(s,word));
  
}
}
