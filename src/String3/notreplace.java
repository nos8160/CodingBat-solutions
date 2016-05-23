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
public class notreplace {
public static String notReplace(String str){
    
    
   
 String s="";
if(str.equals("is")) return "is not";

 int last=0;  
 
 
    for (int i = 0; i < str.length()-2+1; i++) {
 
        String ss= str.substring(i,i+2);
        if(str.substring(i, i+2).equals("is")){
        if(i==0 && !Character.isLetter(str.charAt(i+2))){
            s=s+str.substring(last, i);
       s= s+"is not";
       last=i+2;
       
        }
        
            
            if(i>0 && i<str.length()-2){
        if(Character.isLetter(str.charAt(i-1))==false && Character.isLetter(str.charAt(i+2))==false){
       s=s+str.substring(last, i);
       s=s+"is not";
       last=i+2;
    
           
        }
            }
      
        if(i==str.length()-2 && !Character.isLetter(str.charAt(i-1))&& str.substring(i, i+2).equals("is")){
  s=s+str.substring(last, i);
  s=s+"is not";
  last=i+2;

      }
        
        }
    }
   s=s+str.substring(last);
    
    return s;
 
  }
    public static void main(String ars[]){
String s="p";
        System.out.println(notReplace(s));
}    
}
