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
public class stringE {
    
    public static boolean stringE(String str){
    int count=0;
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
        if(ch[i]=='e')
            count++;
        }
    if(count>0&&count<4)
        return true;
    else 
        return false;
    }
    
    
public static void main(String args[]){

Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
    System.out.println(stringE(s));
}    
}
