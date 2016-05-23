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
public class maketags {
    
      public static String name(String tag,String word){
      String s="<"+tag+">";
    String s2="<"+"/"+tag+">";
      return s+word+s2;
      }
    
public static void main(String arsg[]){

String tag="b";
String word="word";
    System.out.println(name(tag, word));

}    
    
}
