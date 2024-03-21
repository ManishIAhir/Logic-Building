// Accept string from user and count number of words in string of sentence......
//  These code works only when there is only one space between two words,..

import java.util.*;

public class P1{
public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);

    String str;

    System.out.println("Enter the string");
    str=sc.nextLine();
    
    String[] Arr=str.split(" ");

    System.out.println("Number of words in string are "+Arr.length);
    // System.out.println(str);
    int iCount=0;

    for(int i=0;i<Arr.length;i++){
        iCount++;
    }
    System.out.println("Number of words in string are "+iCount);
}

}