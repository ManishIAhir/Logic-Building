// check whether if strings are anagram or not
import java.util.*;

public class P9{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the string 1 :");
        String s1=sc.nextLine();

        System.out.println("Enter the string 2 :");
        String s2=sc.nextLine();

        // s1.toLowerCase();
        // s2.toLowerCase();
        
        char[] charArray1=s1.toCharArray();
        char[] charArray2=s2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        boolean areAnagram=Arrays.equals(charArray1,charArray2);

        if(areAnagram){
            System.out.println("Anagram ");
        }else{
             System.out.println("Are not anagram ");
        }
    }
}