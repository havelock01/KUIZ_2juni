/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import counting.HitungAndro;
import counting.HitungWeb;

/**
 *
 * @author Muhammad Rizqi - 123190083
 */
public class Main {
    public static void main(String[] args) {
        Scanner pilih = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int form;
            
            System.out.println("FORM PENDAFTARAN PT. SKYLINE");
            System.out.println("1. Android Development");
            System.out.println("2. Web Development");
            System.out.print("Pilih Jenis Form : ");
            form = pilih.nextInt();
            
            switch (form){
                case 1 :
                    android(input);
                    break;
                case 2 :
                    website(input);
                    break; 
            }
    }
    
    public static void android(Scanner input){
        String nik;
        String nama;
        double scoreTulisan;
        double scoreCoding;
        double scoreInterview;
        int pilihan;
            
            Scanner pilih = new Scanner(System.in);
            System.out.println(" ");
            Scanner file = new Scanner(System.in);
            System.out.println("FORM PENDAFTARAN\n");
            System.out.println(" ");
            System.out.print("Input NIK : ");
            nik = file.nextLine();
            System.out.print("Input Nama : ");
            nama = file.nextLine();
            System.out.print("Input Nilai Tes Tulis : ");
            scoreTulisan = file.nextDouble();
            System.out.print("Input Nilai Tes Coding : ");
            scoreCoding = file.nextDouble();
            System.out.print("Input Nilai Tes Wawancara : ");
            scoreInterview = file.nextDouble();
            HitungAndro hitungAndro = new HitungAndro(nik, nama, scoreTulisan, scoreCoding, scoreInterview);
            
            do{
                System.out.println(" ");
                System.out.println("Menu");
                System.out.println("1. Edit");
                System.out.println("2. Tampil");
                System.out.println("3. Exit");
                System.out.print("Pilih : ");
                pilihan = pilih.nextInt();
                  
                    switch(pilihan) {
                        case 1:
                            Scanner inputBaru = new Scanner(System.in);
                            System.out.println(" ");
                            System.out.println("FORM EDIT");
                            System.out.print("Input Nilai Tes Tulis : "); hitungAndro.scoreTulisan = inputBaru.nextDouble();
                            System.out.print("Input Nilai Tes Coding : "); hitungAndro.scoreCoding = inputBaru.nextDouble();
                            System.out.print("Input Nilai Tes Wawancara : "); hitungAndro.scoreInterview = inputBaru.nextInt();
                            break;
                        case 2:
                            double countScore;
                            String namaUser;
                            System.out.println(" ");
                            
                            countScore = hitungAndro.eliminateTulisan() + hitungAndro.eliminateCoding() + hitungAndro.eliminateInterview();
                            namaUser = hitungAndro.getNama();
                          
                            System.out.println("Nilai Akhir : " + countScore);
                            if (countScore < 85) {
                                System.out.println("KETERANGAN : GAGAL!");
                                System.out.println("Mohon maaf kepada " + namaUser + " telah ditolak Sebagai Android");
                            } else {
                                System.out.println("KETERANGAN : LOLOS!");
                                System.out.println("Selamat kepada " + namaUser + " telah diterima sebagai Android");
                            }
                            break;
                            
                            case 3 :
                                System.out.println(" ");
                                System.out.println("====Terima Kasih Telah Menggunakan :D ====");
                                break;
                    }
                } while (pilihan!=3); 
    }
    
    public static void website(Scanner input){
        String nik;
        String nama;
        double scoreTulisan;
        double scoreCoding;
        double scoreInterview;
        int pilihan;
            
            Scanner pilih = new Scanner(System.in);
            System.out.println(" ");
            Scanner file = new Scanner(System.in);
            System.out.println("FORM PENDAFTARAN\n");
            System.out.println(" ");
            System.out.print("Input NIK : ");
            nik = file.nextLine();
            System.out.print("Input Nama : ");
            nama = file.nextLine();
            System.out.print("Input Nilai Tes Tulis : ");
            scoreTulisan = file.nextDouble();
            System.out.print("Input Nilai Tes Coding : ");
            scoreCoding = file.nextDouble();
            System.out.print("Input Nilai Tes Wawancara : ");
            scoreInterview = file.nextDouble();
            HitungWeb hitungWeb = new HitungWeb(nik, nama, scoreTulisan, scoreCoding, scoreInterview);
            
            do{
                System.out.println(" ");
                System.out.println("Menu");
                System.out.println("1. Edit");
                System.out.println("2. Tampil");
                System.out.println("3. Exit");
                System.out.print("Pilih : ");
                pilihan = pilih.nextInt();
                  
                    switch(pilihan) {
                        case 1:
                            Scanner inputBaru = new Scanner(System.in);
                            System.out.println(" ");
                            System.out.println("FORM EDIT");
                            System.out.print("Input Nilai Tes Tulis : "); hitungWeb.scoreTulisan = inputBaru.nextDouble();
                            System.out.print("Input Nilai Tes Coding : "); hitungWeb.scoreCoding = inputBaru.nextDouble();
                            System.out.print("Input Nilai Tes Wawancara : "); hitungWeb.scoreInterview = inputBaru.nextInt();
                            break;
                        case 2:
                            double countScore;
                            String namaUser;
                            System.out.println(" ");
                            
                            countScore = hitungWeb.eliminateTulisan() + hitungWeb.eliminateCoding() + hitungWeb.eliminateInterview();
                            namaUser = hitungWeb.getNama();
                          
                            System.out.println("Nilai Akhir : " + countScore);
                            if (countScore < 85) {
                                System.out.println("KETERANGAN : GAGAL!");
                                System.out.println("Mohon maaf kepada " + namaUser + " telah ditolak Sebagai Web");
                            } else {
                                System.out.println("KETERANGAN : LOLOS!");
                                System.out.println("Selamat kepada " + namaUser + " telah diterima sebagai Web");
                            }
                            break;
                            
                            case 3 :
                                System.out.println(" ");
                                System.out.println("====Terima Kasih Telah Menggunakan :D ====");
                                break;
                    }
                } while (pilihan!=3);
    }
}
