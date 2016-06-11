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
public class stringClean {
public static String stringClean(String str){
if(str.length()==1)
    return str.substring(0);
int i=0;
if(str.charAt(i)==str.charAt(i+1)){
while(i<str.length()-1)
{
if(str.charAt(i)==str.charAt(i+1))
    i++;
else
    return str.charAt(i)+stringClean(str.substring(i+1));
}}

    return str.charAt(0)+stringClean(str.substring(1));

}    
    public static void main(String[] args) {
        String s="azzzd";
        System.out.println(stringClean(s));
    }
}
