/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String3;

/**
 *
 * @author USER
 */
public class sameEnds {
    public static String sameEnds(String string){
        if(string.length()<2){
        return "";
        }
        String s="";
    for(int i=string.length()/2;i>=0;i--){
 s=string.substring(0, i);
        if(string.endsWith(s)){
        
        return s;
        }
    
    }
    return s;
    
    }
public static void main(String arsd[]){
String s="xxx";
    System.out.println(sameEnds(s));
}   
}
