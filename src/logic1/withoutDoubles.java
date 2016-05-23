/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic1;

/**
 *
 * @author USER
 */
public class withoutDoubles {
 public static int module(int die1,int die2,boolean noDoubles){
    if(die1==die2 && noDoubles==true){
    
    return die1+die2+1;
    }
    else
    return die1+die2;
    }
    public static void main(String ars[]){
    
    int a=12,b=45;
        System.out.println(module(a, b, true));    
}
}