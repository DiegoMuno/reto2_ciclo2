package model;

import java.util.ArrayList;

public class TotalPrice {

    private ArrayList<Computador> computadoras;

    private double totalPcs;
    private double totalLaptops;
    private double totalDesktops;

    private Computador computadores;

    public TotalPrice(Computador computadores) {
        super();
        // this.totalPcs = totalPcs;
        // this.totalLaptops = totalLaptops;
        // this.totalDesktops = totalDesktops;
        this.computadores = computadores;
        computadoras = new ArrayList<>(); // agregando la lista video 22 julio 1:13 horas
    }

    // public String mostrarTotales() {
        
    // }

    public double getTotalDesktops() {
        return totalDesktops;
    }

    public double getTotalLaptops() {
        return totalLaptops;
    }

    public double getTotalPcs() {
        return totalPcs;
    }

    public ArrayList<Computador> getComputadoras() {
        return computadoras;
    }

    public void setTotalDesktops(double totalDesktops) {
        this.totalDesktops = totalDesktops;
    }

    public void setTotalLaptops(double totalLaptops) {
        this.totalLaptops = totalLaptops;
    }

    public void setTotalPcs(double totalPcs) {
        this.totalPcs = totalPcs;
    }

    public void setComputadoras(ArrayList<Computador> computadoras) {
        this.computadoras = computadoras;
    }

}
