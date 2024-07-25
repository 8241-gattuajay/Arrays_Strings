package Day2.com;

import java.util.Scanner;

public class PosandNegarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr1=new int[n];

        for(int i=0;i< arr1.length;i++){
            arr1[i]= sc.nextInt();
        }

        int[] pos=new int[n];
        int[] neg=new int[n];

        for(int i=0;i<n;i++){
            if(arr1[i]>=0)
                pos[i]=arr1[i];
            else
                neg[i]=arr1[i];
        }
        System.out.println("pos arr:");
        for (int i=0;i< pos.length;i++) {
            if(pos[i]!=0)
            System.out.println(pos[i]+" ");
        }

        System.out.println("neg arr:");
        for(int i=0;i< neg.length;i++){
            if(neg[i]!=0)
            System.out.print(neg[i]+" ");
        }

    }
}
