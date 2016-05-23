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
public class lasttwo {
public static String name(String str){
    if(str.length()<2)
        return str;
StringBuilder sb=new StringBuilder(str.substring(str.length()-2, str.length()));
sb=sb.reverse();
return str.substring(0, str.length()-2)+sb;
    }
    
public static void main(String arsg[]){

String s="bang";
    System.out.println(name(s));

}       
}
