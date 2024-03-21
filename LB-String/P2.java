//// Accept string from user and display each word  from sentence of string....


import java.util.*;


class P2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String fullname;

        System.out.println("Enter the fullname :");
        fullname=sc.nextLine();
        
        String fullname2=fullname.trim();
        String[] Arr=fullname2.split(" ");
        
        System.out.println("Words in string are ");
        for(int i=0;i<Arr.length;i++){
            System.out.println(Arr[i]);
        }
    }
}
