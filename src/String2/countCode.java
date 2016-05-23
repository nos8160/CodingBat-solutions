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
public class countCode {
    public static int name(String str){
       int count=0;
       String pattern="co[a-z]e";
        for(int i=0;i<str.length()-3;i++){
            if(str.substring(i, i+4).matches(pattern)){
            count =count+1;
            }
        
        }
return count ;
}

public static void main(String arsg[]){
String s="";
    System.out.println(name(s));



}

    
}
