/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion1;

/**
 *
 * @author nazrul
 */
public class stringClean {
public static String stringClean(String str){
if(str.length()<=1)
    return str.substring(0);
if(str.charAt(0)==str.charAt(1))
return stringClean(str.substring(1));
else
    return str.charAt(0)+stringClean(str.substring(1));
}    
    public static void main(String[] args) {
        String s="azzzd";
        System.out.println(stringClean(s));
    }
}
