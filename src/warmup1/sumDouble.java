/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warmup1;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class sumDouble {
    
    public static int summDouble(int x,int y){
        if(x==y)
            return 2*(x+y);
        else
    
    return x+y;
    }
public static void main(String args[]){
int none,ntwo;
    Scanner scan=new Scanner(System.in);
    none=scan.nextInt();
    ntwo=scan.nextInt();
    int res=summDouble(none, ntwo);
    System.out.println(res);

}    
}
