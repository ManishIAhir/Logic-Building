//Accept string from user and display word which has maximum charecter , from sentence of string....

import java.util.*;


class P2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String fullname;

        System.out.println("Enter the fullname :");
        fullname=sc.nextLine();
        
        String fullname2=fullname.trim();
        String[] Arr=fullname2.split(" ");
        
        int max=0;
        int iPos=0;

        for(int i=0;i<Arr.length;i++){
            if(Arr[i].length()>max){
                max=Arr[i].length();
                iPos=i;
            }
        }
        
                System.out.println("Longest word in string is "+Arr[iPos]);
        System.out.println("longest words has "+max+" elements");
        
    }
}
