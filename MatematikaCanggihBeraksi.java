/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

import java.util.Scanner;

public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        MatematikaCanggih Mtk = new MatematikaCanggih();
        
        System.out.println("Masukkan Pilihan : ");
        Mtk.pilihan = input.nextInt();
        
        System.out.println("Masukkan angka pertama :");
        Mtk.angka1 = input.nextInt();
        
        System.out.println("Masukkan angka kedua :");
        Mtk.angka2 = input.nextInt();
        
        Mtk.getpilihan();
        
    }
    
}
