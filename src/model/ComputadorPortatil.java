package model;

public class ComputadorPortatil extends Computador {
 
   public static final int EXTRA_CHARGER = 500;
   public static final int EXTRA_BATERY = 100;

   private int extraBatery;
   private int extraCharger;
   private double calculo;

   public ComputadorPortatil() {
       super();
       extraBatery = EXTRA_BATERY;
       extraCharger = EXTRA_CHARGER;
   }

   public ComputadorPortatil(int extraBatery) {
       super();
       this.extraBatery = extraBatery;
       extraCharger = EXTRA_CHARGER;
   }

   public ComputadorPortatil(int extraBatery, int extraCharger) {
       super();
       this.extraBatery = extraBatery;
       this.extraCharger = extraCharger;
   }

   public double calcularPrecio() {
       
       return super.calcularPrecio() + extraBatery + extraCharger + 20; 
   }

   public int getExtraBatery() {
       return extraBatery;
   }

   public int getExtraCharger() {
       return extraCharger;
   }

   public void setExtraBatery(int extraBatery) {
       this.extraBatery = extraBatery;
   }

   public void setExtraCharger(int extraCharger) {
       this.extraCharger = extraCharger;
   }

}
