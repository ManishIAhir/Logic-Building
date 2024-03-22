import java.util.*;

public class P7{

    public static void main(String[] args){
         Scanner sobj=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sobj.nextLine();

        char Arr[]=str.toCharArray();

        for(int i=0 ;i<Arr.length;i++)
        {
            if(Arr[i]>='A' && Arr[i]<='Z')
            {
                Arr[i]=(char)((int) Arr[i]+32);
            }

            System.out.print(Arr[i]);
    }
}