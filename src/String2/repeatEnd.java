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
public class repeatEnd {
    public static String name(String str,int n){
           
        String s="";
   
        for(int i=0;i<n;i++){
       s=s+str.substring(str.length()-n);
        
        }
return s;
}

public static void main(String arsg[]){
String s="bollo";
int n=2;
    System.out.println(name(s,n));



}

}
