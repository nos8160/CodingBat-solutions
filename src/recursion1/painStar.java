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
public class painStar {
public static String painStar(String str){
if(str.length()<=1)
    return str;
else
    if(str.charAt(0)==str.charAt(0+1))
        return str.charAt(0)+"*"+painStar(str.substring(1));
else
        return str.charAt(0)+painStar(str.substring(1));

}    
    public static void main(String[] args) {
        String s="adb";
        System.out.println(painStar(s));
    }
}
