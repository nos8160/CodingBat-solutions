/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String_2;

/**
 *
 * @author USER
 */
public class catdog {
    public static boolean catdog(String str){
    int cat=0,dog = 0;
    for(int i=0;i<str.length()-3+1;i++){
    if(str.substring(i,i+3).equals("dog")){
    
dog++;    
    }
    if(str.substring(i, i+3).equals("cat")){
    
    cat++;
    }
   
    }
        return cat==dog;
    }
public static void main(String sar[]){
String s="";
    System.out.println(catdog(s));
}    
}
