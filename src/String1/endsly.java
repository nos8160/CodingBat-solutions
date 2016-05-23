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
public class endsly {
  public static boolean name(String str){
      if(str.length()<2)
          return false;
      String s=str.substring(str.length()-2, str.length());
if(s.equals("ly"))
    return  true;
else
    return false;
    }
    
public static void main(String arsg[]){

String s="oddly";
    System.out.println(name(s));

}        
}
