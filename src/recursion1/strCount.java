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
public class strCount {
    public static int strCount(String str, String sub){
    if(str.length()<sub.length())
        return 0;
    if(str.substring(0,sub.length()).equals(sub))
        return 1+strCount(str.substring(sub.length()-1), sub);
    else
        return strCount(str.substring(1), sub);
    
    }
    public static void main(String[] args) {
        String s="asdf";
        System.out.println(strCount(s, "asdf"));
    }
}
