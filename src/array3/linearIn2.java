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
public class linearIn2 {
public static boolean linearin2(int [] outer, int[] inner){
int i=0,j=0;
while(i<outer.length && j<inner.length){
if(inner[j]==outer[i]){
i++;
j++;
}
else
    i++;

}
return j==inner.length;
}    
    public static void main(String[] args) {
        int arr[]={4,5};
        int arr23[]={6,8};
        System.out.println(linearin2(arr, arr23));
    }
}
