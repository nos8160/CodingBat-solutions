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
public class countHi2 {
    public static int countHi2(String str){
        if(str.length()<=2 && !str.equals("hi")) return 0;
    
    if( str.substring(0, 2).equals("hi")  )
    return 1+countHi2(str.substring(2));
    else
        if(str.charAt(0)=='x' && str.substring(1, 3).equals("hi"))
        return countHi2(str.substring(3));
    else
            return countHi2(str.substring(1));
       
        }
    public static void main(String[] args) {
        String st="xhi";
        System.out.println(countHi2(st));
    }
}
