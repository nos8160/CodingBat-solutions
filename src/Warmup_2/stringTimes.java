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
public class stringTimes {
public static String stringtimes(String str,int n){

StringBuilder ss=new StringBuilder();
StringBuilder sb=new StringBuilder();
      for(int i=0;i<n;i++)
        ss=sb.append(str);
        return ss.toString();
}
    
    public static void main(String args[]){
String str="hi";
int n=3;
System.out.println(stringtimes(str,n));

}    
}
