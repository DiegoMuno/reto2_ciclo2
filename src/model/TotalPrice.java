package model;

import java.util.ArrayList;

public class TotalPrice {

    private ArrayList<Computador> computadoras;

    private double totalPcs;
    private double totalLaptops;
    private double totalDesktops;

    private Computador computador;

    public TotalPrice(double totalPcs, double totalLaptops, double totalDesktops, Computador computador) {
        super();
        this.totalPcs = totalPcs;
        this.totalLaptops = totalLaptops;
        this.totalDesktops = totalDesktops;
        this.computador = computador;
        computadoras = new ArrayList<>(); // ultimo punto agregando la lista video 22 julio 1:13 horas
    }

    public double getTotalDesktops() {
        return totalDesktops;
    }

    public double getTotalLaptops() {
        return totalLaptops;
    }

    public double getTotalPcs() {
        return totalPcs;
    }

    public Computador getComputador() {
        return computador;
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

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

}
