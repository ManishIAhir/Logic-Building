//write a java application which accepts strins from user and prints differeence between capital and small letters

import java.util.*;
public class P10{
class GivesDifference
{
    char[] brr;
    
    GivesDifference(char[] arr){
        brr=arr;
    }

    public int difference(){
        int iCap=0;
        int ilower=0;
        for(int i=0;i<=brr.length-1;i++){
            if(brr[i]>='A'&&brr[i]<='Z'){
                iCap++;
            }
            if(brr[i]>='a'&&brr[i]<='z'){
                ilower++;
            }
        }
         return(iCap-ilower);  
    }
}

public static void main(String[] args)
{
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the string :-");
     String str=sc.nextLine();

     str=str.trim();

     char[] crr=str.toCharArray();
     
     GivesDifference object = new GivesDifference(crr);
    
    int iRet = object.difference();
    System.out.println("Difference between capital and small letters of string are "+iRet);
}

}