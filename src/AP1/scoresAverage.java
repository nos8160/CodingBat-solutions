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
public class scoresAverage {
public static int average(int []scores, int start, int end){
int sum=0;
    for(int i=start;i<=end;i++){
    sum=sum+scores[i];
    }
    return sum/(end-start+1);

}
    public static int scoresAverage(int [] scores){
        
if((average(scores, 0, scores.length/2-1)>average(scores,scores.length/2, scores.length-1)))
    return average(scores, 0, scores.length/2-1);
else
    return average(scores,scores.length/2, scores.length-1);
    }    
    public static void main(String[] args) {
        int arr[]={4,5};
        System.out.println(scoresAverage(arr));
    }
}
