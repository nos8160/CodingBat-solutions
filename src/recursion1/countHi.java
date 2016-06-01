/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion1;

/**
 *
 * @author nazrul
 */
public class countHi {
 public static int countHi(String str){
 if(str.length()<=1)
     return 0;
 else
     if(str.substring(0, 2).equals("hi"))
         return 1+countHi(str.substring(1));
 else
         return countHi(str.substring(1));
 
 }   
    public static void main(String[] args) {
        String str="asdfjaslkj";
        System.out.println(countHi(str));
    }
}
