/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String3;

/**
 *
 * @author USER
 */
public class ghappy {
    public static boolean ghappy(String str){
    boolean b=false;
        if(str.indexOf("g")<0){
        return true;
        }
        
        for(int i=0;i<str.length();i++){
    if(str.charAt(i)=='g' && str.length()>1){
         if(i==str.length()-1 && str.charAt(i-1)=='g')
    {
    b=true;
    break;

    }
    if(i==0 && str.charAt(i+1)=='g'){
    b=true;
    }
    
    if((i>0 && i<str.length()-1) && (str.charAt(i-1)=='g' || str.charAt(i+1)=='g')){
    b=true;
    
    }
    else{
    b=false;
   
    }
   
    
    }
    
    
    }
        return b;
    
    }
    
public static void main(String ars[]){
String ss="gg";
    System.out.println(ghappy(ss));

}    
}
