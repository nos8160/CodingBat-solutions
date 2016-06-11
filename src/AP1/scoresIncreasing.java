/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP1;

/**
 *
 * @author nazrul
 */
public class scoresIncreasing {
public static boolean scoresIncreasing(int[] scores){
int i=0;
boolean b=true;
    while(true && i<scores.length-1){
if(scores[i]<=scores[i+1]){
b=true;
}
else
return false;
i++;
}
    return b;
}    
    public static void main(String[] args) {
        int arr[]={1,1,2,4,3,7};
        System.out.println(scoresIncreasing(arr));
    }
}
