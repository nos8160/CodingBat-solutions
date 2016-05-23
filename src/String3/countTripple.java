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
public class countTripple {
    public static int countTriple(String str){
        int count=0;
    for(int i=0;i<str.length()-3+1;i++){
    if(str.charAt(i)==str.charAt(i+1)&& str.charAt(i+1)==str.charAt(i+2)){
    count++;
    }
    
    }
    
   return count;
    }
    
    public static void main(String arsg[]){
    String s="xxx";
        System.out.println(countTriple(s));
    
    
    }
}
