package Day2.com;

import java.util.Scanner;

public class ArrTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int avg;
        int[] arr1=new int[n];

        for(int i=0;i< arr1.length;i++){
            arr1[i]= sc.nextInt();
        }

        for(int i=0;i<arr1.length;i++){
            sum=sum+arr1[i];
        }

        System.out.println("Sum of the elements in the array: "+sum);
        avg=sum/n;

        System.out.println("Average of the elements in the array: "+avg);
    }
}
