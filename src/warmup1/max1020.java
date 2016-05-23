/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warmup1;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class max1020 {
public static int max1020(int x,int y){
if(x>y && (x>9 && x<21))
    return x;
else
        if(!(x>9 && x<21)&&!(y>9&&y<21))
    return 0;
else
        return y;
     
             
            

}
    
    public static void main(String ar[]){
int a,b;
Scanner scan=new Scanner(System.in);
 a=scan.nextInt();
b=scan.nextInt();
int res=max1020(a, b);
        System.out.println(res);

}    
}
