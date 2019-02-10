/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urvish.arraysandstrings.example8;

/**
 *
 * @author patelurv
 */
public class ZeroMatrix {

    public static void getZeroMatrix(int a[][], int R, int C) {
        int row[] = new int[R];
        int col[] = new int[C];

        for (int i = 0; i < R; i++) {
            row[i] = 1;
        }
        for (int i = 0; i < C; i++) {
            col[i] = 1;
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (a[i][j] == 0) {
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (row[i] == 0 || col[j] == 0) {
                    a[i][j] = 0;
                }
            }
        }

    }

    public static void printMatrix(int a[][], int R, int C) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        int a[][] = {{1, 1, 1, 1},
        {1, 0, 0, 1},
        {1, 1, 1, 1}};

        printMatrix(a, 3, 4);
        getZeroMatrix(a, 3, 4);
        printMatrix(a, 3, 4);

    }
}
