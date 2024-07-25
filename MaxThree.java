package Operators;

import java.util.Scanner;

public class MaxThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println("Max of three numbers is :");
        if(a>b&&a>c){
            System.out.println(a);
        } else if (b>a && b>c) {
            System.out.println(b);
        } else {
            System.out.println(c);

        }
    }
}
