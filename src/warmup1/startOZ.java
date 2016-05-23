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
public class startOZ {
    
    public static String startOZ(String str){
    
        if(str.startsWith("oz"))
            return "oz";
        else 
            if(str.charAt(0)=='o')
                return "o";
        else
                if(str.charAt(1)=='z')
                    return "z";
        else
                    return "false";
        
    }
    public static void main(String ar[]){
    Scanner scan=new Scanner(System.in);
    String ss=scan.nextLine();
        String s=startOZ(ss);
        System.out.println(s);
        
    }
}
