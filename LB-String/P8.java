
import java.util.*;

public class P8{
   public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    String str;
    
    str=sc.nextLine();
    String str2=str.trim();
    String str3=str2.toLowerCase();
    
    char[] crr=str3.toCharArray();
    
    int[] frequency=new int[26];

    for(int i=0;i<=26;i++){
        frequency[crr[i]-97]++;
        System.out.println(frequency[i]);
    }

   }
}