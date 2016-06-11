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
public class countPairs {
public static int countPairs(String str){
if(str.length()<=2)
    return 0;
else
    if(str.charAt(0)==str.charAt(0+2))
        return 1+countPairs(str.substring(1));
else
        return countPairs(str.substring(1));
}
    public static void main(String[] args) {
 String s="asdf";
        System.out.println(countPairs(s));
    }
}
