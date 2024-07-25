package String.com;

import java.util.Arrays;
import java.util.Scanner;

public class CharFre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        char ch1[] =str.toLowerCase().toCharArray();

        int visited=-1;

        int [] fr = new int [ch1.length];

        for(int i=0;i<ch1.length;i++){
            int count=1;
            for(int j=i+1;j<ch1.length;j++){
                if(ch1[i]==ch1[j]){
                    count++;
                    fr[j]= visited;
                }
            }
            if(fr[i]!=visited)
                fr[i]=count;
        }

        System.out.println("-------------------");

        System.out.println("Character | Frequency");

        System.out.println("-------------------");


        for(int i=0;i< fr.length;i++){
            if(fr[i]!=visited){
                System.out.println(" "+ ch1[i]+"    |     "+fr[i]);
            }
        }

        System.out.println("-------------------");
    }
}
