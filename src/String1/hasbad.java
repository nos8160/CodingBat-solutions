/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String1;

/**
 *
 * @author Lenovo
 */
public class hasbad {
public static boolean hasbad(String str){
if(str.length()<3)
    return false;

    if(str.length()==3 && str.substring(0, str.length()).equals("bad"))
  {
  return true;
  }
  else
  if(str.length()>3 &&( str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")))
  {
  return true;
  }
else
      return false;
}
    
public static void main(String arsg[]){

String s="xba";
    System.out.println(hasbad(s));

}       
}
