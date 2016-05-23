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
public class prefixagain {
    public static boolean name(String str,int n){
        boolean b=false;
        String s=str.substring(0, n);
   
        for(int i=n;i<str.length()-n+1;i++){
        if(s.equals(str.substring(i, i+n)))
        {
        b=true;
        
        }
        
        }
return b;
}

public static void main(String arsg[]){
String s="aa";
int n=1;
    System.out.println(name(s,n));



}

    
}
