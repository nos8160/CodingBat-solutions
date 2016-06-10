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
public class allStar {
public static String allStar(String str){
if(str.length()<=1)
    return str;
else
return str.charAt(0)+"*"+allStar(str.substring(1));
}   
    public static void main(String[] args) {
        String s="ab";
        System.out.println(allStar(s));
    }
}
