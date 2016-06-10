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
public class countClumps {
public static int countClumps(int [] nums){
int count=0, clumps=0;
int j=0;
for(int i=0;i<nums.length;i++){
while(j<nums.length){
if(nums[i]==nums[j]){
count++;
}
else{
break;
}
j++;
}
if(count>=2){
    
clumps++;

count=0;
}
else
    count=0;
}



return clumps;
}    
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(countClumps(arr));
    }
}
