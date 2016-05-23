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
public class mirror {
    public static String mirrorEnds(String str){
    String ss="";
    char[] arr;
        for(int i=str.length();i>0;i--){
        arr=str.substring(0, i).toCharArray();
        for (int j= arr.length-1; j >=0; j--) {
        ss=ss+arr[j];
        
        
    }
//              System.out.println(ss);
            if(str.endsWith(ss)){
        return str.substring(0, i);
        
        }
            else
            {ss="";}
          
        
        }
    return "";
    }
    public static void main(String arsg[]){
    String s="abXYZba";
        mirrorEnds(s);
        System.out.println(mirrorEnds(s));
    }
}
