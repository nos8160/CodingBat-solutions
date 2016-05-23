/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup_2;

/**
 *
 * @author Lenovo
 */
public class last2 {

    public static int last2(String str){
        if(str.length()<2)
            return 0;
       
    String req=str.substring(str.length()-2, str.length());
        System.out.println(req);
    int count=0;
    int first=0,last=2;
    for(int i=2;i<str.length();i++){
    if(str.length()>2&&str.substring(first, last).equalsIgnoreCase(req))
        count=count+1;
    ++first;
    ++last;
    }
    return count;
    }
    public static void main(String asr[]){
 String s="a";
        System.out.println(last2(s));
}    
}
