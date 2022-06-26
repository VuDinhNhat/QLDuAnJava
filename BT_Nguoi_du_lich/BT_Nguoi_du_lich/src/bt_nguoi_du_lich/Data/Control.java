/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_nguoi_du_lich.Data;

import java.util.Scanner;

/**
 *
 * @author thanh
 */
public class Control {

    public static int [][] trongso = FileController.ArrayTrongSo("TrongSo.txt");
    public static int n;
    public static int[][] c = new int[10][10];
    public static int[] x = new int[100];
    public static int[] chuaxet = new int[100];
    public static int[] kq = new int[100];
    public static int MIN = 0;
    public static int a = 1;
    static Scanner sc = new Scanner(System.in);

    public static void Init() {
//        System.out.print("Nhap n:");
//        n = sc.nextInt();
        n = trongso.length+1;
//        System.out.print("Nhap chi phi:\n");
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                c[i][j] = trongso[i-1][j-1];
            }
        }
                System.out.println("----------------------");

        x[1] = 1;
        for (int i = 2; i <= n; i++) {
            chuaxet[i] = 1;
        }
    }

    public static void Result() {
        for(int i = 0; i <= n; i++){
            for( int j = 0; j <= n; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.print("\n T1 =>");
        for (int i = 2; i <= n; i++) {
            System.out.print("T");
            System.out.print(kq[i]);
            System.out.print("=>");
        }
        System.out.print("T1");
        System.out.print("\n Chi phi cua hanh trinh la: ");
        System.out.print(MIN);
    }

    public static void Work() {
        int S = 0;
        for (int i = 1; i <= n - 1; i++) {
            S = S + c[x[i]][x[i + 1]];
        }
        S = S + c[x[n]][1];
        if (S < MIN || a == 1) {
            a = 0;
            MIN = S;
            for (int i = 1; i <= n; i++) {
                kq[i] = x[i];
            }
        }
    }

    public static void Try(int i) {
        for (int j = 2; j <= n; j++) {
            if (chuaxet[j] != 0) {
                x[i] = j;
                chuaxet[j] = 0;
                if (i == n) {
                    Work();
                } else {
                    Try(i + 1);
                }
                chuaxet[j] = 1;
            }
        }
    }
}
