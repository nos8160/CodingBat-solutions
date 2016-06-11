/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic1;

/**
 *
 * @author nazrul
 */
public class fizzString2 {
public static String fizz2(int n){
if(n%3==0 && n%5==0){
return "fizzbuzz";
}
if(n%3==0)
    return "fizz";
if(n%5==0)
    return "buzz";
else
    return n+"!";
}   
    public static void main(String[] args) {
        int n=4;
        System.out.println(fizz2(n));
    }
}
