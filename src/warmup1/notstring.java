/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warmup1;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class notstring {
public static String notstring(String str){
if(str.startsWith("not"))
    return str;
else
    return "not"+ " "+str;
}
    
    public static void main(String arsfg[]){

Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
String ss=notstring(s);
        System.out.println(ss);

}    
}
