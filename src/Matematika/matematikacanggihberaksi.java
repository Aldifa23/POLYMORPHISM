/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

import java.util.Scanner;


/**
 *
 * @author Difa
 */
public class matematikacanggihberaksi {
   
    public static void main(String[] args) {
      
        try (Scanner input = new Scanner(System.in)) {
            MatematikaCanggihDifa mtk = new MatematikaCanggihDifa(0, 0, 0);
            
            mtk.pilihan();
            
            
            System.out.print("Masukkan Pilihan anda : ");
            mtk.pilihan = input.nextInt();
            
            
            System.out.print("Masukkan angka pertama : ");
            mtk.angka1 = input.nextInt();
            
            
            System.out.print("Masukkan angka kedua : ");
            mtk.angka2 = input.nextInt();
            
            
            mtk.getpilihan();
        }
    }
  } 