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
public class count11 {
public static int count11(String str){
if(str.length()<2)
    return 0;
if(str.substring(0, 2).equals("11"))
    return 1+count11(str.substring(2));
else
    return count11(str.substring(1));
}    
    public static void main(String[] args) {
        String s="asdf";
        System.out.println(count11(s));
    }
}
