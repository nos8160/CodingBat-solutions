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
public class twoTwo {
public static boolean twoTwo(int [] nums){
  int position = -22;
  boolean result = true;

  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2) {
      if (position == i - 1){
        result = true;
      }
      else {
        result = false;
      }
      position = i;
        System.out.println(position);
    }
  }

  return result;
}    

    public static void main(String[] args) {
        int arr[]={2,2};
        System.out.println(twoTwo(arr));
    }
}
