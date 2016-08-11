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
public class scoresClump {
public static boolean scorsClump(int[] scores){
for(int i=0;i<scores.length-2;i++){
if(scores[i+1]-scores[i]<=2 && scores[i+2]-scores[i]<=2 )
{
return true;
}
}
return false;
}    
    public static void main(String[] args) {
        int arr[]={4,5,6};
        System.out.println(scorsClump(arr));
    }
}
