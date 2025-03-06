/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rinatriagustianis2304041.pertemuan4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Pertemuan4 {

    public static void main(String[] args) {
        Scanner inputObjek = new Scanner(System.in);
        
        // Latihan menyebutkan bilangan prima
        System.out.print("Masukan bilangan : ");
        int i, batas = inputObjek.nextInt();
        
        System.out.println("Bilangan prima dari 1 sampai dengan " + batas);
        for (i = 2; i <= batas; i++) {
            int j;
            for (j = 2; j*j <= i; j++){
                if (i % j == 0) {
                    break;
                }
            }
            if (j*j > i) {
                System.out.println(i);
            }
        } 
    }
}
