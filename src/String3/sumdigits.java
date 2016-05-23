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
public class sumdigits {
public static int sumdigit(String str){
int count=0;
    for(int i=0;i<str.length();i++){
if(Character.isDigit(str.charAt(i)))
count=count+Integer.parseInt(str.substring(i, i+1));

}
return count;
}
    
    public static void main(String arts[]){

String ss="asdf";
        System.out.println(sumdigit(ss));


}    
}
