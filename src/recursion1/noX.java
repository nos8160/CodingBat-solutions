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
public class noX {
public static String noX(String str){
if(str.length()==0)
    return "";
else
    if(str.charAt(0)=='x')
        return ""+noX(str.substring(1));
else
        return str.charAt(0)+noX(str.substring(1));
}    
    public static void main(String[] args) {
        String s="asdf";
        System.out.println(noX(s));
    }
}
