/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String1;

/**
 *
 * @author Lenovo
 */
public class nTwice {
public static String ntwice(String str,int n){
    return str.substring(0, n)+str.substring(str.length()-n, str.length());
    }
    
public static void main(String arsg[]){

String s="helo";
int n=2;
    System.out.println(ntwice(s, n));

}       
}
