//  Accept string from and display pattern
//  Input:
//          Hello

/*
    output:
     j
i   H  
    H   e   
    H   e   l   
    H   e   l   l   
    H   e   l   l   o
    
 
 */

import java.util.*;


class P14{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the string ");
      String Str=sc.nextLine();
    
      char[] arr = Str.toCharArray();

      for(int i=0;i<(arr.length);i++)
      {
        for(int j=0;j<(arr.length);j++){
           if(i>=j){
            System.out.print(arr[j]+" ");
           }else{
             System.out.print(" ");
           }
        }
        System.out.println();
      }
    }
}