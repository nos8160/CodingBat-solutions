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
public class maxblock {
    public static int maxblock(String str){
    int count=0;
    int temp=0;
    char ch;
    for(int i=0;i<str.length();i++){
    
    for(int j=0;j<str.length();j++){
    if(str.charAt(j)==str.charAt(i)){
    count++;
    }
    else
    {
    count=0;
    }
    if(count>temp){
    temp=count;
    }
        
    }
    count=0;
    }
    return temp;
    }
public static void main(String arsg[]){
String s="+++++,++,+++,++++";
    System.out.println(maxblock(s));

}    
}
