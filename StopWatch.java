package LogicalProblems;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Press enter to start ");
        sc.nextLine();

        long start=System.currentTimeMillis();

        System.out.println("Press enter to stop ");
        sc.nextLine();

        long stop=System.currentTimeMillis();

        long elaspse= stop-start;

        System.out.println("Time taken: "+elaspse/1000.0+" seconds");
    }
}
