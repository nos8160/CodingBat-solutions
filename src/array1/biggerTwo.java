/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author Lenovo
 */
public class biggerTwo {
 
public static int[] big(int[]a,int[]b){
    
int sum_Of_a=a[0]+a[1],sum_Of_b=b[0]+b[1];
if(sum_Of_a>sum_Of_b || sum_Of_a==sum_Of_b)
    return a;
else
    return b;
        }

    public static void main(String[] args) {
        int[] array1={5,87,8};
        int[] array2={8,9,7};
        int array3[]=big(array1, array2);
        for(int i=0;i<array3.length;i++){
        System.out.println(array3[i]);

}  
        
    }

}
        
    

