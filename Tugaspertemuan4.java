/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rinatriagustianis2304041.tugaspertemuan4;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class Tugaspertemuan4 {
    public static void main(String[] args) {
        Scanner objekInput = new Scanner(System.in);
        /*
        // Soal Nomor 1 Ganjil
        System.out.print("Masukkan bilangan : ");
        int n = objekInput.nextInt();
        
        System.out.println("Bilangan dari 1 sampai dengan " + n);
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        } 
        
        
        // Soal Nomor 2 Ganjil
        System.out.print("Masukkan Batas Awal : ");
        int batasAwal = objekInput.nextInt();
        System.out.print("Masukan Batas Akhir : ");
        int batasAkhir = objekInput.nextInt();
        
        System.out.println("Bilangan ganjil dari " + batasAwal + " sampai " + batasAkhir + " adalah : ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        } */
        
        
        // Soal Nomor 3 Ganjil
        System.out.print("Masukan bilangan : ");
        int n = objekInput.nextInt();
        int faktorial = 1;
        
        System.out.print("Faktorial dari " + n + "! = ");
        if (n < 0) {
            System.out.print("Bilangan tidak boleh kurang dari 0");
        } else if (n == 0) {
            System.out.print("1");
        } else {
            for (int i = n; i > 0; i--) {
                faktorial *= i;
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" * ");
                }
            }
            System.out.print(" = " + faktorial);
        }
        
        objekInput.close();
    }
}    