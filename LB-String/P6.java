import java.io.*;
import java.util.*;

class program307 {
    public static void main(String arg[]) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sobj.nextLine();

        char crr[]=new char[str.length()];

        int end=(str.length())-1;       //13

        System.out.println(end);

        for(int i=0;i<str.length();i++)
        {
            crr[i]=str.charAt(i);
            
        }
        char temp='\0';

        for(int start=0;start<(end);start++,end--)
        {
            temp=crr[start];
            crr[start]=crr[end];
            crr[end]=temp;

        }
        for(int i=0;i<str.length();i++)
        {
            System.out.print(crr[i]);
            
        }
        System.out.println();

        // now conversion of char array to string:-
        
        String str1=new String(crr);

        System.out.println(crr);
        
    }
}
       