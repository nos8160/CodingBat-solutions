/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

import java.util.Arrays;

/**
 *
 * @author nazrul
 */
public class fizzBuzz {
    public static String[] fizzBuzz(int start,int end){
        String[] arr=new String[end-start];
    for(int i=start,j=0;i<end;i++,j++){
    if(i%3==0 && i%5==0)        
    arr[j]="FizzBuzz";
    else
        if(i%3==0)
        arr[j]="Fizz";
    else
            if(i%5==0)
                arr[j]="Buzz";
    else
                arr[j]=String.valueOf(i);
    
    }
return arr;
    
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzBuzz(5, 8)));
        
    }
    
}
