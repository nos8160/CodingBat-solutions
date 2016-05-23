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
public class extraFont {
public static String extraFont(String str){
if(str.length()<3)
    return str+str+str;
else
    return str.substring(0, 2)+str.substring(0, 2)+str.substring(0, 2);
}
    
    public static void main(String rgs[]){
String s="a";
        System.out.println(extraFont(s));

}    
}
