/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String1;

/**
 *
 * @author USER
 */
public class mincat {

    public static String mincat(String a,String b){
        
     int sa=a.length();
     int sb=b.length();
     if(sa==sb)
         return a+b;
     else
     if(sa>sb)
         return a.substring(sa-sb,sa)+b;
     else
         return a + b.substring(sb-sa,sb);
    }
    public static void main(String ars[]){
    String s="hello";
    String ss="hi";
        System.out.println(mincat(s, ss));
    
    }
}
