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
public class middleThree {
public static String name(String str){
    int i=(int) (str.length()/2-.5);
    return str.substring(i, i+3);
    }
    
public static void main(String arsg[]){

String s="and";
    System.out.println(name(s));

}       
}
