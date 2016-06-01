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
public class changePi {
public static String changePi(String str){
if(str.length()==0)
    return "";
    if(str.length()==1)
    return str;

else

if(str.charAt(0)=='p'&& str.charAt(0+1)=='i'){
    
return "3.14"+changePi(str.substring(2));

}
else
    return str.charAt(0)+changePi(str.substring(1));
}    
    public static void main(String[] args) {
        String s="pi";
        System.out.println(changePi(s));
    }
}
