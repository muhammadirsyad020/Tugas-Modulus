/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author LENOVO
 */
public class MatematikaCanggih extends Matematika {
    int pilihan;
    
    public void pilihan(){
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Modulus / sisa bagi");
    }
    
    public void getpilihan(){
        switch (pilihan){
            case 1 :
                System.out.println("Hasil Pertambahan " + angka1 + " + " + angka2 + " = " + pertambahan());
            case 2 :
                System.out.println("Hasil Pengurangan " + angka1 + " - " + angka2 + " = " + pengurangan());
            case 3 :
                System.out.println("Hasil Modulus " + angka1 + " % " + angka2 + " = " + modulus());
        }
        
    }
    
    
}
