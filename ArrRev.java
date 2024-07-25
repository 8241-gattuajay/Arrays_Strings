package Day2.com;

import java.util.Scanner;

public class ArrRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];

        for(int i=0;i< arr1.length;i++){
            arr1[i]= sc.nextInt();
        }

        for(int i= arr1.length-1;i>=0;i--){
            System.out.print(arr1[i]+" ");
        }
    }
}
