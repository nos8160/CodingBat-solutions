/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String1;

/**
 *
 * @author USER
 */
public class withoutx {
public static String withoutx(String str){
 if (str.length() > 0 && str.charAt(0) == 'x') {
str= str.substring(1);
  }

  if (str.length() > 0 && str.charAt(str.length()-1) == 'x') {
    str = str.substring(0, str.length()-1);
  }
  
  return str;
}
  
    public static void main(String args[]){
String s="xy";
        System.out.println(s.substring(1));

    }


}
