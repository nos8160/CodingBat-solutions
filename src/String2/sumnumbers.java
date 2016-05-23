/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String2;

/**
 *
 * @author Lenovo
 */
public class sumnumbers {

    public static int sumnumbers(String str){
    int sum=0;
    
        for(int i=0;i<str.length();i++){
    if(Character.isDigit(str.charAt(i))){
        System.out.println(str.charAt(i));
    
    sum=sum+Integer.parseInt(str.substring(i, i+1));
    }
    }
        return sum;
    }
    public static void main(String ars[]){
String ss="7 11";
        System.out.println(sumnumbers(ss));

}    
}
