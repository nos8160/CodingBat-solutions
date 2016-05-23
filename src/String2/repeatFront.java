/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String_2;

/**
 *
 * @author USER
 */
public class repeatFront {

    public static String repeatFront(String str,int n){
    String s="";
    String ss=str.substring(0, n);
        for (int i = 0; i < ss.length(); i++) {
            s=s+ss.substring(0,ss.length()-i);
        }
    return s;
    }
    
    public static void main(String arsa[]){

String s="ice cream";
int n=2;
        System.out.println(repeatFront(s, n));

}    
}
