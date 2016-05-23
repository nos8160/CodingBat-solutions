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
public class twochar {
public static String name(String str,int index){
    int b=str.length();
    if(b<3)
        return str;
    else
        if(index+2>b || index<0)
            return str.substring(0, 2);
    else
        return str.substring(index, index+2);
    }
    
public static void main(String arsg[]){

String s="bang";
int n=2;
    System.out.println(name(s, n));

}       
}
