/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

/**
 *
 * @author nazrul
 */
public class linearIn {
public static boolean linearIn(int[] outer, int[] inner){
    int count=0;
    for(int i=0;i<inner.length;i++){
    for(int j=0;j<outer.length;j++){
    if(inner[i]==outer[j]){
    count++;
    break;
    }
        
    
    }
    
    }
return count>=inner.length;
}    
    public static void main(String[] args) {
        int arr1[]={2,2,2,2};
        int arr2[]={2,4};
        System.out.println(linearIn(arr1, arr2));
    }
}
