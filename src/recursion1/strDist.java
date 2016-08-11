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
public class strDist {
public static int strDist(String str, String sub){
if(str.indexOf(sub)==-1)
    return 0;
if(str.substring(0).startsWith(sub) && str.substring(0).endsWith(sub))
    return str.length();
else 
    if(!str.substring(0).startsWith(sub))
    return strDist(str.substring(1,str.length()), sub);
else
        return strDist(str.substring(0, str.length()-1), sub);
}    
    public static void main(String[] args) {
        String s="asdf";
        System.out.println(strDist(s, "s"));
    }
}
