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
public class sumNumbers {
    public static int sumnumbers(String str){
    int sum=0;
    String ss="";
    for(int i=0;i<str.length();i++){
    if(Character.isDigit(str.charAt(i))  ){
    
        ss=ss+str.charAt(i);
     
    }
    else{
    if(ss.length()>0 ){
    sum=sum+Integer.parseInt(ss);
  ss="";
    }
    
    }
    }
    if(ss.length()>0)
    return sum+Integer.parseInt(ss);
    else return sum;
    }
    
    public static void main(String arsg[]){
    
    String ss="b4a12s1";
        System.out.println(sumnumbers(ss));
    
    }
    
}
