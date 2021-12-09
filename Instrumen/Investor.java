package Instrumen;

import java.util.ArrayList;
import java.util.List;
import DurasiInvestasi.*;

/**
 * Class ini merupakan subjek. berfungsi untuk menyimpan data observer,
 * mengirimkan notifikasi, dan juga akan diimplementasikan decorator pattern
 * 
 * @author Muhammad Irfan
 * @version 09-12-2021
 */
public class Investor{
	
   private List<Observer> observers = new ArrayList<Observer>();
   private double state;

   /**
    * Method untuk mendapatkan atribut state
    * @return
    */
   public double getState() {
      return state;
   }

   /**
    * Method untuk mengisi nilai state sesuai paramter dan memanggil 
    * method notifyAllObservers();
    * @param state input berupa dana yang akan diinvestasikan
    */
   public void setState(double state) {
      this.state = state;
      notifyAllObservers();
   }

   /**
    * Method untuk menambahkan list observer(instrumen investasi)
    * @param observer input berupa objek observer(instrumen investasi)
    */
   public void attach(Observer observer){
      observers.add(observer);
   }

   /**
    * Method untuk mengirimkan notifikasi pada seluruh list obeserver
    */
   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	

   /** 
    * Method untuk implementasi decorator pattern.
    * Akan memanggil method setTahun yang mana akan mencetak durasi investasi ke layar
    * @param durasi input berupa durasi investasi oleh user, nilainya 1 atau 2
    */
   public void waktuInvestasi(int durasi) {
      //Jika dipilih durasi 1
      if(durasi == 1) {
         Tahun tahun = new SatuTahunDecorator(new Durasi());
         tahun.setTahun();
      } else if(durasi == 2) { // Jika dipilih durasi 2
         Tahun tahun = new DuaTahunDecorator(new Durasi());
         tahun.setTahun();
      }
   }
}