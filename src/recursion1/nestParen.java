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
public class nestParen {
public static boolean nestParen(String str){
if(str.length()==0 || str.equals("()"))
    return true;
if(!(str.charAt(0)=='(' && str.charAt(str.length()-1)==')')){
return false;
}
else
 return     nestParen(str.substring(1, str.length()-1));

}    
    public static void main(String[] args) {
        String s="(()";
        System.out.println(nestParen(s));
    }
}
