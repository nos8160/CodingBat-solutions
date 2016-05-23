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
public class zipzap {
public static String zip(String str){
String s="";

if(str.length()<3){
return str;
}
else{
for(int i=0;i<str.length();i++){

    if(str.charAt(i)=='z' && str.charAt(i+2)=='p'){
    s=s+str.charAt(i)+str.charAt(i+2);
    i=i+2;
    }
    else
    {
    s=s+str.substring(i,i+1);
//        System.out.println(s);
    }

}

}
return s;
}
    public static void main(String arg[]){

String s="abcppp";
        System.out.println(zip(s));
}    
}
