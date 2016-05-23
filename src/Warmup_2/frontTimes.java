/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup_2;

/**
 *
 * @author Lenovo
 */
public class frontTimes {
    public static String fronttimes(String str,int n){
   String res="";
        if(str.length()<3){
   for(int i=0;i<n;i++)
   {res=res+str;
     
   }  return res;}
          
        for(int i=0;i<n;i++){
        res=res+ str.substring(0,3);
        }
        return res;
    }
public static void main(String args[]){
String s="ab";
int n=4;
    System.out.println(fronttimes(s, n));
}    
}
