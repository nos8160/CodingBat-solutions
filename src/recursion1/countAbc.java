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
public class countAbc {
 public static int countAbc(String str){
 if(str.length()<3)
     return 0;
 if(str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba"))
     return 1+countAbc(str.substring(1));
 else
     return countAbc(str.substring(1));
 
 }   
    public static void main(String[] args) {
        String str="asdf";
        System.out.println(countAbc(str));
    }
         
}
