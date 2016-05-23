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
public class wordsend {

    public static String wordend(String str,String word){
    String s="";
    int len=str.length()-word.length()+1;
        for (int i = 0; i < str.length()-word.length()+1; i++) {
           if(word.equals(str.substring(i, i+word.length()))){
           if(i>0 && i<len-1){
           s=s+str.charAt(i-1)+str.charAt(i+word.length());
           
           }
             if(i==0 && i==len-1)  return "";  
           else if(i==0){
           s=s+str.charAt(i+word.length());
           }
           else if(i==len-1){
           s=s+str.charAt(i-1);
           
           }
                  
           }
            
        }
        
        return s;
    }
    public static void main(String args[]){
String s="xy";
String ss="xy";
        System.out.println(wordend(s, ss));

}    
}
