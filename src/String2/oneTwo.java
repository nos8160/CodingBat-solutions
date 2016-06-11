/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String2;

/**
 *
 * @author nazrul
 */
public class oneTwo {
    public static String oneTwo(String str){
    String s="";
        if(str.length()<3) return s;
    else
        for(int i=0;i<str.length()-2;i=i+3){
    s=s+str.substring(i+1, i+3)+str.charAt(i);
    
    }
    return s;
    }
    public static void main(String[] args) {
        String s="chocolatedf";
        System.out.println(oneTwo(s));
    }
}
