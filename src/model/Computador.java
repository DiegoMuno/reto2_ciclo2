package model;

/**
 * Computador
 */
public class Computador {

    public static final double PRECIO_BASE = 0;
    public static final double PRECIO_MOUSE = 0;
    public static final double PRECIO_HEADPHONE = 0;
    private double mouse;
    private double headphone;
    private double precioBase;
    private double precioFinal;


    public Computador() {
        super();        
    }

    //metodo para calcular precio basico de un pc
    public double calcularPrecio() {
        precioFinal = mouse + headphone + precioBase;
        return precioFinal;
    }

    public double getHeadphone() {
        return headphone;
    }

    public double getMouse() {
        return mouse;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setHeadphone(double headphone) {
        this.headphone = headphone;
    }

    public void setMouse(double mouse) {
        this.mouse = mouse;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    
    
}