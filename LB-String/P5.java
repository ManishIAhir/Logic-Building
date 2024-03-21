//  Accept string from user and reverse that string in place....
//  { M A N I S H}
//    i         j
//        i>=j
// 1St Approach:-
//  String arr is immutable so we cant reverse it or change the contents...
// using StringBuffer class
import java.util.*;

public class P5{

    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);

       String str;

       System.out.println("Enter the string ");
       str=sc.nextLine();
       
       String str2=str.trim();
       System.out.println(str2);

    //    int i=0;
    //    int j=str2.length()-1;
       
    //    while(i<=j){
    //     char temp=str2.charAt(i);
    //     str2.charAt(i)=str2.charAt(j);
    //     str2.charAt(i)=temp;

    //      i++;
    //      j--;
    //    }     
    //    System.out.println(str2);
          StringBuffer sb = new StringBuffer(str2);
          System.out.println(sb.reverse());

    }
}