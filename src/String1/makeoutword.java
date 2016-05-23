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
public class makeoutword {
  public static String makeoutword(String out,String word){
    return out.substring(0, 2)+word+out.substring(2, 4);
    }
    
public static void main(String arsg[]){

String s="<<>>";
String s2="word";
    System.out.println(makeoutword(s, s2));

}        
}
