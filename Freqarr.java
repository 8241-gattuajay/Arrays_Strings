package Day2.com;

import java.util.Scanner;

public class Freqarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr1=new int[n];

        int [] fr = new int [arr1.length];


        int visited=-1;

        for(int i=0;i< arr1.length;i++){
            arr1[i]= sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr1[i]==arr1[j]){
                   count++;
                   fr[j]= visited;
                }
            }
            if(fr[i]!=visited)
                fr[i]=count;
        }

        System.out.println("-------------------");

        System.out.println("Element | Frequency");

        System.out.println("-------------------");


        for(int i=0;i< fr.length;i++){
            if(fr[i]!=visited){
                System.out.println(" "+ arr1[i]+"    |     "+fr[i]);
            }
        }

        System.out.println("-------------------");
    }
}
