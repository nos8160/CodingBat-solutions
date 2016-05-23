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
public class seecolor {
    public static String name(String str){
    if(str.startsWith("red"))
        return "red";
    else if(str.startsWith("blue"))
        return "blue";
    else
        return "";
    }
    
public static void main(String arsg[]){

String s="";
    System.out.println(name(s));

}   
}
