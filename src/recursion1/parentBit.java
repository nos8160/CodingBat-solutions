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
public class parentBit {
public static String parenBit(String str)   {

if(str.charAt(0)==')' || str.length()<2)
    return ")";
if(str.charAt(0)=='(')
    return str.substring(0, str.indexOf(")")+1);
else
    return parenBit(str.substring(1));
} 
    public static void main(String[] args) {
        String s="asfd";
        System.out.println(parenBit(s));
    }
}
