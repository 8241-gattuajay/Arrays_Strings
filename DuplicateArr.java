package Day2.com;

import java.util.Scanner;

public class DuplicateArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr1=new int[n];

        for(int i=0;i< arr1.length;i++){
            arr1[i]= sc.nextInt();
        }
        int dup[]=new int[n];
        for(int i=0;i<n;i++){
            //int count=0;
            for(int j=i+1;j<n;j++){
                if(arr1[i]==arr1[j]){
                    // count++;
                     dup[j]=arr1[i];
                }
            }
        }
        for(int i=0;i<n;i++){
            if(dup[i]!=0){
                System.out.print(dup[i]+" ");
            }
        }
    }
}
