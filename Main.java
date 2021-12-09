import java.util.Scanner;

import Instrumen.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        Investor investor = new Investor();
        
        System.out.println("\n #### MANAJEMEN INVESTASI ####");
        System.out.println("\nLangkah 1 : Tentukan Durasi Investasi\n");
        
        System.out.println("== SAHAM == ");
        menu();
        new Saham(investor,inputDurasi());
        System.out.println("== KRIPTO ==");
        menu();
        new Kripto(investor,inputDurasi());
        System.out.println("== REKSADANA ==");
        menu();
        new Reksadana(investor,inputDurasi());
        
        System.out.println("\nLangkah 2 : Tentukan Dana yang akan diinvestasi\n");
        System.out.print("Input Dana yang akan diinvestasikan : ");
        double dana = input.nextDouble();
        System.out.println();
        investor.setState(dana/3);
        
        input.close();
     }

     public static void menu() {
        System.out.print("\tDurasi Investasi :\n\t1. Satu Tahun\n\t2. Dua Tahun\n\tPilihan : ");
     }

     public static int inputDurasi() {
        int durasi = input.nextInt();
        while(durasi < 1 || durasi > 2){
            System.out.println("\t!! Input melebihi batas !!, silakan input kembali");
            System.out.print("\tPilihan : ");
            durasi = input.nextInt();
        }
        return durasi;
     }
}
