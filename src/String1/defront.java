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
public class defront {
public static String defront(String str){
if(str.charAt(0)=='a' && str.charAt(1)=='b')
    return str;
else
    if(str.charAt(0)=='a')
        return str.substring(0, 1)+str.substring(2);
else
        if(str.charAt(1)=='b')
            return str.substring(1);
else
            return str.substring(2);

}
    
    public static void main(String args[]){
String s="";
        System.out.println(defront(s));

}    
}
