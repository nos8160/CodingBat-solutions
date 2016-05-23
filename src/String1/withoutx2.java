/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String1;

/**
 *
 * @author USER
 */
public class withoutx2 {
    public static String withoutx2(String str){
        StringBuilder sb=new StringBuilder(str);
        if(str.length()<1)
            return str;
    if(str.startsWith("xx"))
    {
    return sb.delete(0, 2).toString();
    }
    else
        if(str.startsWith("x")){
        return sb.deleteCharAt(0).toString();
        }
    else
            if(str.charAt(1)=='x'){
            return sb.deleteCharAt(1).toString();
            }
    else
                return str;
    
    
    }
    public static void main(String args[]){
        
        String s="";
        System.out.println(withoutx2(s));
    
    }
}
