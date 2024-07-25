package Day2.com;

import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        int[][] add = new int[m][n];

        if(m == n) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr2[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    add[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(add[i][j] + "  ");
                }
                System.out.println("\n");
            }


        }
        else{
            System.out.println("No addition......... ");
        }
    }
}
