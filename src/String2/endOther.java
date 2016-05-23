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
public class endOther {
    public static boolean endother(String a,String b){
    
    if(a.length()<b.length())
    {
    return a.equalsIgnoreCase(b.substring(b.length()-a.length()));
    
    }
    else
         return b.equalsIgnoreCase(a.substring(a.length()-b.length()));
    }
    
    public static void main(String sr[]){
    
    String s="gas";
    String ss="asgas";
        System.out.println(endother(s, ss));
    
    
    }
    
}
