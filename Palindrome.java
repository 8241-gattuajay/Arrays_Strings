package String.com;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            rev=rev+ch;
        }

       // System.out.println(rev);

        if(str.equalsIgnoreCase(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
