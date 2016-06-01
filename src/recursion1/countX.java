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
public class countX {
public static int countX(String str){
if(str.length()==0)
    return 0;
else
    if(str.charAt(0)=='x')
        return 1+countX(str.substring(1));
else
        return countX(str.substring(1));
}    
    public static void main(String[] args) {
        String ss="asdf";
        System.out.println(countX(ss));
    }
}
