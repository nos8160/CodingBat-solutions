/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

/**
 *
 * @author nazrul
 */
public class matchUp {
public static int matchUp(int [] nums1,int [] nums2){
int count=0;
for(int i=0;i<nums1.length;i++){
if((Math.abs(nums1[i]-nums2[i])<=2)&& (Math.abs(nums1[i]-nums2[i])>0)){
count++;
}
}
return count;
}    

    public static void main(String[] args) {
        int nums1[]={5,6};
        int nums2[]={6,89};
        System.out.println(matchUp(nums1, nums2));
    }
}
