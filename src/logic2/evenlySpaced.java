/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic2;

/**
 *
 * @author nazrul
 */
public class evenlySpaced {
    public static boolean evenlySpace(int a, int b, int c){
         int mid;
int large=Math.max(a, Math.max(b, c));

  int low=Math.min(a, Math.min(b, c));
 if(a<large && a>low)
      mid=a;
 else
 if(b<large && b>low)
     mid=b;
 else
      mid=c;
        System.out.println(large+""+mid+""+low);
  if((large-mid)==(mid-low))
      return true;
  else
      return false;
  
    }
    public static void main(String[] args) {
        int a=4,b=6,c=2;
        System.out.println(evenlySpace(a, b, c));
    }
}
