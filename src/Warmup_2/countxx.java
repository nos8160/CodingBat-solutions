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
public class countxx {
    public static int  countxx(String str){
   int count=0;
        for(int i=0;i<str.length()-1;i++){
    if("xx".equals(str.substring(i,i+2)))
      count=count+1;
        
        }
        return count;
    }
public static void main(String args[]){
String s="baxxxtr";
    System.out.println(countxx(s));
}    
}
