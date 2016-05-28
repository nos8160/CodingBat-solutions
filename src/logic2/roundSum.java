/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic2;

/**
 *
 * @author nazrul
 */
public class roundSum {
public static int round10(int num){
if(num%10<5)
    return num-(num%10);
else
    return num+(10-num%10);
  
}
    public static int roundSum(int a, int b, int c){
return round10(a)+round10(b)+round10(c);
}    
    public static void main(String[] args) {
        int a=5,b=8,c=45;
        System.out.println(roundSum(a, b, c));
    }
}
