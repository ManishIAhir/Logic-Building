import java.util.*;


class P12{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the string ");
      String Str=sc.nextLine();
    
      char[] arr = Str.toCharArray();

      for(int i=0;i<(arr.length);i++)
      {
        for(int j=0;j<(arr.length);j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
      }
    }
}