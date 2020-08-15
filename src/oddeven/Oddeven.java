/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddeven;

/**
 *
 * @author Guntur Wicaksono
 */
import java.util.Scanner;
public class Oddeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int number = reader.nextInt();
        if (number % 2 == 0){
            System.out.printf("Angka %d adalah Genap", number);
        }else{
            System.out.printf("Angka %d adalah Ganjil", number);
        }
    }
    
}
