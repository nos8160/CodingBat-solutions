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
public class concat {
    public static String name(String a,String b){
if(a.length()==0||b.length()==0)
            return a.concat(b);
        else
        if(a.substring(a.length()-1, a.length()).equals(b.substring(0, 1)))
    return a.concat(b.substring(1, b.length()));
        else
            return a.concat(b);
    }
    
public static void main(String arsg[]){

String s="alsjdf";
String b="asdf";
    System.out.println(name(s, b));

}   
}
