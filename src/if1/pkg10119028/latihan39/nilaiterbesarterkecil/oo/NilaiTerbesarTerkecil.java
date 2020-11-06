/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan39.nilaiterbesarterkecil.oo;
import java.util.Scanner;


/**
 *
 * @author
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program untuk membandingkan nilai
 *                     terbesar dan terkecil dengan konsep OOP
 */
public class NilaiTerbesarTerkecil {
    private static Scanner scanner = new Scanner(System.in);
    private static String namaPetugas;
    private static int banyaknyaNilaiMahasiswa;
    private static int nilaiMahasiswa[];
    private static int nilaiTerkecil = 0;
    private static int nilaiTerbesar = 0;
    
    private static String inputNamaMhs() {
        System.out.println("=====Program Nilai Terbesar dan Terkecil Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scanner.nextLine();
        return namaPetugas;
    }
    
    private static int inputNilaiMhs() {
        inputNamaMhs();
        System.out.print("Masukkan Banyaknya Jumlah Nilai Mahasiswa : ");
        banyaknyaNilaiMahasiswa = scanner.nextInt();

        nilaiMahasiswa = new int[banyaknyaNilaiMahasiswa];

        for (int i = 0; i < banyaknyaNilaiMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " = ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }
        return 0;
    }
    
    private static void cekNilaiTerbesarTerkecil() {
        inputNilaiMhs();
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        nilaiTerkecil = nilaiMahasiswa[0];
        for (int i = 0; i < banyaknyaNilaiMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);

            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }

            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
        }
    }
    
    public static void tampilNilaiMhs() {
        cekNilaiTerbesarTerkecil();
        System.out.println();
        System.out.println("Nilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);

        System.out.println("\nPetugas : " + namaPetugas);
    }
}