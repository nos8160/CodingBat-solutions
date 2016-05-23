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
public class combostring {
  public static String combostring(String a,String b){
      int lena=a.length();
      int lenb=b.length();
      if(lena<lenb)
    return a+b+a;
      else
          return b+a+b;
    }
    
public static void main(String arsg[]){

String s="bang";
String s2="goof";
    System.out.println(combostring(s, s2));

}        
}
