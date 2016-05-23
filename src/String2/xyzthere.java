/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String2;

/**
 *
 * @author USER
 */
public class xyzthere {
    

    public static boolean xyzthere(String str){
   boolean b=false;
 if(str.length()<4)
 {
 return str.startsWith("xyz");
 }
        for(int i=0;i<str.length()-3+1;i++){

if(i>0 && str.substring(i, i+3).equals("xyz") && str.charAt(i-1)!='.'){
b=true;
}
if(i==0 && str.subSequence(i, i+3).equals("xyz")){
b=true;
}
}
return b;
}
        
     
    
    
   
    
    
    public static void main(String a[]){
    
    String ss="abc.xyz";
        System.out.println(xyzthere(ss));
    
    
    }
    
}
