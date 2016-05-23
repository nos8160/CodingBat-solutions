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
public class without2 {
public static String without2(String str){
    if(str.length()<2)
        return str;
if(str.substring(0,2).equals(str.substring(str.length()-2, str.length())))
    return str.substring(2);
else
    return str;

}
    public static void main(String args[]){

String s="hi";
        System.out.println(without2(s));

}    
}
