package Instrumen;

import java.util.ArrayList;
import java.util.List;

import DurasiInvestasi.*;

public class Investor{
	
   private List<Observer> observers = new ArrayList<Observer>();
   private double state;

   public double getState() {
      return state;
   }

   //pake array untuk tahun
   public void setState(double state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	

   public void waktuInvestasi(int durasi) {
      if(durasi == 1) {
         Tahun tahun = new SatuTahunDecorator(new Tahun());
         tahun.setTahun();
      } else if(durasi == 2) {
         Tahun tahun = new DuaTahunDecorator(new Tahun());
         tahun.setTahun();
      }
   }
}