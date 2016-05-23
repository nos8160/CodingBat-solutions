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
public class countHi {
public static int counthi(String str){
    int count=0;
for(int i=0;i<str.length()-2+1;i++){
if(str.substring(i,i+2).equals("hi"))
count++;
}
return count;
}
    public static void main(String arsg[]){
String s="hihi";
        System.out.println(counthi(s));

}    
}
