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
public class changeXy {
public static String changeXY(String str){
if(str.length()==1 && str.charAt(0)=='x')
    return ""+'y';
if(str.length()<=1)
    return str;
else
    if(str.charAt(0)=='x')
        return 'y'+changeXY(str.substring(1));
else
        return str.charAt(0)+changeXY(str.substring(1));
}    
    public static void main(String[] args) {
        String s="sadf";
        System.out.println(changeXY(s));
    }
}
