package Day2.com;

import java.util.Arrays;
import java.util.Scanner;

public class MaxandMinArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr1=new int[n];

        for(int i=0;i< arr1.length;i++){
            arr1[i]= sc.nextInt();
        }
        Arrays.sort(arr1);
        System.out.println("Maximum element in the array: "+arr1[n-1]);
        System.out.println("Minimum element in the array: "+arr1[0]);
    }
}
