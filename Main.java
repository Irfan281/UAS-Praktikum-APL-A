import java.util.Scanner;
import Instrumen.*;

/**
 * Class Main yang akan mengimplementasikan observer pattern,
 * mencetak menu, mengambil inputan user
 * 
 * @author Muhammad Irfan
 * @version 09-12-2021
 */
public class Main {
   static Scanner input = new Scanner(System.in);
   /**
    * Method main untuk menjalankan program
      * @param args default parameter main
      */
   public static void main(String[] args) {
      //Instansiasi objek investor
      Investor investor = new Investor();
      
      //Mencetak Menu
      System.out.println("\n #### MANAJEMEN INVESTASI ####");
      System.out.println("\nLangkah 1 : Tentukan Durasi Investasi\n");
      
      System.out.println("== SAHAM == ");
      menu();
      //Membuat objek observer Saham dan mengambil input durasi
      new Saham(investor,inputDurasi());
      System.out.println("== KRIPTO ==");
      menu();
      //Membuat objek observer Kripto dan mengambil input durasi
      new Kripto(investor,inputDurasi());
      System.out.println("== REKSADANA ==");
      menu();
      //Membuat objek observer Reksadana dan mengambil input durasi
      new Reksadana(investor,inputDurasi());
      
      System.out.println("\nLangkah 2 : Tentukan Dana yang akan diinvestasi\n");
      System.out.print("Input Dana yang akan diinvestasikan : ");
      double dana = input.nextDouble();
      System.out.println();
      //Memanggil method setstate dengan input parameter berupa nilai dana yang diinvestasikan
      investor.setState(dana/3);
      
      input.close();
   }

   /**
    * Method untuk mencetak menu
    */
   public static void menu() {
      System.out.print("\tDurasi Investasi :\n\t1. Satu Tahun\n\t2. Dua Tahun\n\tPilihan : ");
   }

   /**
    * Method untuk mengambil input durasi
    * @return nilai durasi waktu investasi
    */
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
