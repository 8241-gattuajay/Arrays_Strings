package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
        boolean isAnagram=true;

        if(str.length()!=str1.length())
            isAnagram=false;
        else{
            char[] ch1=str.toCharArray();
            char[] ch2=str1.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);


            if(Arrays.equals(ch1,ch2)){
                isAnagram=true;
            }
            else{
                isAnagram=false;
            }
        }

        if(isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
