/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String_2;

/**
 *
 * @author USER
 */
public class starout {
public static String starout(String str){
    String ss="";
    int s=str.length();
    if(str.indexOf('*')<0){
    
    return str;
    }
for(int i=0;i<s;i++)
{
if((i==0 && (str.charAt(i)!='*'&& str.charAt(i+1)!='*'))  || (i==s-1 && (str.charAt(s-1)!='*' && str.charAt(s-2)!='*')) || (i>0 && i<s-1 && str.charAt(i)!='*' && str.charAt(i+1)!='*' && str.charAt(i-1)!='*'))
ss=ss+str.charAt(i);
}

return ss;
}


    public static void main(String arsgs[]){
String s="*a";

System.out.println(starout(s));

}    

}