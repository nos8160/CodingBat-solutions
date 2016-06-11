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
public class endX {
public static String endX(String str){
if(str.length()==0)
    return "";
else
    if(str.charAt(0)=='x')
        return endX(str.substring(1))+str.charAt(0);
else
        return str.charAt(0)+endX(str.substring(1));

}   
    public static void main(String[] args) {
        String s="bac";
        System.out.println(endX(s));
    }
}
