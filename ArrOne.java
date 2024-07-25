package Day2.com;

import java.util.Scanner;

public class ArrOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr1=new int[n];

        for(int i=0;i< arr1.length;i++){
            arr1[i]= sc.nextInt();
        }

        for(int i=0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
