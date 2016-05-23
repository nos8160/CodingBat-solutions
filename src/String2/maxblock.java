/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String2;

/**
 *
 * @author Lenovo
 */
public class maxblock {
    public static int max(String str){
    int len=0;
    int count = 0;
            for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
            
            if(str.charAt(i)==str.charAt(j)){
            
             len++;
//                System.out.println(len);
             if(len>count){
                count=len;
                }
                          }
            else if (str.charAt(i)!=str.charAt(j)){           
              if(len>count){
                count=len;
                }
              len=0;
              break;  
            }
            
            }
            len=0;
            
 }
    
    return count;
    }
public static void main(String ars[]){

String s="";
    System.out.println(max(s));
}    
}
