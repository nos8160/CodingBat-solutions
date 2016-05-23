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
public class stringmatch {
    public static int stringmatch(String a,String b){
     int small;
        int g=a.length();
     
     int h=b.length();
     if(g>h)
         small=h;
     else
         small=g;
    int f=0,l=2,count=0;
    for(int i=0;i<small-1;i++){
    if(a.substring(f, l).equals(b.substring(f, l)))
        count=count+1;
    f=f+1;
    l=l+1;
    }
    return count;
    }
public static void main(String args[]){
String a="abc";
String b="abc";
    System.out.println(stringmatch(a, b));

}    
}
