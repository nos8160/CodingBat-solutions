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
public class sameStarchar {
public static boolean name(String str){
    boolean b=true;
for(int i=1;i<str.length()-1;i++){
if(str.charAt(i)=='*'&& str.charAt(i-1)!=str.charAt(i+1)){
b=false;
}


}    

return b;
}

public static void main(String arsg[]){
String s="xy*yzz";
    System.out.println(name(s));    
}
}
