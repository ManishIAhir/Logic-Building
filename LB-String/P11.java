//  Accept string from and display pattern
//  Input:
//          Hello

/*
    output:
     
    H   e   l   l   o
    H   e   l   l   o
    H   e   l   l   o
    H   e   l   l   o
    H   e   l   l   o
 
 */
import java.util.*;

class P11{
    public static void main(StringP[] args){
      Scanner sc=new Scanner(Syatem.in);
      
      System.out.println("Enter the string ");
      String Str=sc.nextLine();
    
      char[] arr = Str.toCharArray();

      for(int i=0;i<arr.length;i++){
        for(int j=0;arr.length;j++){
            System.out.println(arr[j]+" ");
        }
      }
    }
}