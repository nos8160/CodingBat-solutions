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
public class frontagain {
public static boolean name(String str){
    if(str.length()<4)
        return false;
    else
        if(str.substring(0, 2).equals(str.substring(str.length()-2, str.length())))
return true;
    else
            return false;
            }
    
public static void main(String arsg[]){

String s="";
    System.out.println(name(s));

}       
}
