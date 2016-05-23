/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warmup1;

/**
 *
 * @author lenovo
 */
public class mixstart {
    public static boolean mixstart(String str){
    if(str.startsWith("mix") || str.charAt(1)=='i' && str.charAt(2)=='x')
        return true;
    else 
        return false;
    
    }
public static void main(String asf[]){
String s="flj sdf";
boolean b=mixstart(s);
    System.out.println(b);

}    
}
