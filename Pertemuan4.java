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
        /*
        // PERULANGAN FOR
        System.out.println("Masukan nilai untuk hitung mundur roket : ");
        int i, batas = inputObjek.nextInt();
        
        for (i = batas; i >= 0; i--){
            System.out.println(i);
        }
        
        System.out.println("Roket diluncurkan"); 
        
        
        // Latihan for menyebutkan bilangan ganjil
        System.out.print("Masukan bilangan : ");
        int i, batas = inputObjek.nextInt();
        
        System.out.println("Bilangan ganjil dari 1 sampai dengan " + batas);
        for (i = batas; i >= 0; i--) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        } 
        
        
        // PERULANGAN WHILE
        System.out.println("Masukan nilai untuk hitung mundur roket : ");
        int i, batas = inputObjek.nextInt();
        i = batas;
        
        System.out.println("Memulai hitung mundur");
        while (i >= 0) {
            System.out.println(i);
            i--;
        } 
        
        
        // PERULANGAN DO WHILE
        System.out.println("Masukan nilai untuk hitung mundur roket : ");
        int i, batas = inputObjek.nextInt();
        i = batas;
        
        System.out.println("Memulai hitung mundur");
        do {
            System.out.println(i);
            i--;
        } while (i >= 0); {
            System.out.println("Roket diluncurkan");
        } 
        
        
        // BREAK DAN CONTINUE
        System.out.print("Masukan nilai untuk hitung mundur roket : ");
        int i, batas = inputObjek.nextInt();
        
        for (i = batas; i >= 0; i--){
            if (i == 6) {
                continue;
            }
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        
        System.out.println("Roket diluncurkan"); */
        
        
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
