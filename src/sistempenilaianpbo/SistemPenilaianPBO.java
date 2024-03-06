package sistempenilaianpbo;

import java.util.*;
import java.io.*;

/**
 *
 * @author Bintang Prayoga
 */
public class SistemPenilaianPBO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int JumPel = 0;
        
        System.out.println("Masukkan Jumlah Mapel");
        JumPel = input.nextInt();
        input.nextLine();

        
        
    String[] namaMatpel = new String [JumPel];
    String[] Predikat = new String [JumPel];
    int[] nilai = new int[JumPel];
    
    
    
    int nilaiTotal = 0;
    
    for (int i = 0; i < JumPel; i++) {
        System.out.println("Masukkan Nama Mapel ke-" + (i+1) + ":");
        String namaMapel = input.nextLine();
        namaMatpel[i] = namaMapel;
            
        System.out.println("Masukkan Nilai Mapel ke-" + (i+1) + ":");
        int nilaiMapel = input.nextInt();
        input.nextLine();
        nilai[i] = nilaiMapel;
        
        if(nilai[i] >= 85){
            Predikat[i] = "A";
        }else if (nilai[i] >= 75) {
            Predikat[i] = "B";
        } else if (nilai[i] >= 65) {
            Predikat[i] = "C";
        } else if (nilai[i] >= 45) {
            Predikat[i] = "D";
        } else {
            Predikat[i] = "F";
        };
    }
    
    System.out.format("+--------------Sistem Penilaian-----------+%n");
    System.out.format("+-----------------------------------------+%n");
    System.out.format("| Nama Matpel | Nilai | Predikat |%n%n");
    System.out.format("+-----------------------------------------+%n");
    
    for (int i = 0; i < JumPel; i++) {
        System.out.format("| %-11s | %-5s | %-3s | %n", 
                namaMatpel[i], nilai[i], Predikat[i]);
    }
    
    System.out.format("+-------------Rata Rata Nilai-------------+%n");
    
    for (int i = 0; i < nilai.length; i++) {
        nilaiTotal += nilai[i];
    }
    int rataRata = nilaiTotal/nilai.length;
    
    System.out.format("| %-39s | %n", rataRata);
    System.out.format("+-----------------------------------------+%n");
    }

}
