package Day2.com;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int evenCount=0;
        int oddCount=0;
        int[] arr1=new int[n];

        for(int i=0;i< arr1.length;i++){
            arr1[i]= sc.nextInt();
        }
        for(int i=0;i< arr1.length;i++){
            if(arr1[i]%2==0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.println(evenCount);
        System.out.println(oddCount);

    }
}
