package Logical;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=0;
        int second=1;
        int n=sc.nextInt();

        System.out.print(first+" "+second+" ");
        for(int i=2;i<n;i++){
            int next=first+second;
            System.out.print(next+" ");
            first=second;
            second=next;
        }

    }
}
