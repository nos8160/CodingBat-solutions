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
public class scores100 {
public static boolean scores100(int[] scores){
for(int i=0;i<scores.length-1;i++){
if(scores[i]==100 && scores[i+1]==100)
    return true;
}
return false;
}    
    public static void main(String[] args) {
        int arr[]={145,86,45};
        System.out.println(scores100(arr));
    }
}
