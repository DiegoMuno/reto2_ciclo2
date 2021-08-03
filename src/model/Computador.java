package model;

/**
 * Computador
 */
public class Computador {

    public static final double PRECIO_BASE = 0;
    public static final double PRECIO_MOUSE = 0;
    public static final double PRECIO_HEADPHONE = 0;
    public double mouse;
    public double headphone;
    public double precioBase;
    public double precioFinal;


    public Computador() {
        super();  
        mouse = PRECIO_MOUSE;
        headphone = PRECIO_HEADPHONE;
        precioBase = PRECIO_BASE;      
    }

    public Computador(double precioBase, double headphone) {
        super();
        this.precioBase = precioBase;
        this.headphone = headphone;
        mouse = PRECIO_MOUSE;
    }

    public Computador(double precioBase, double headphone, double mouse) {
        super();
        this.precioBase = precioBase;
        this.headphone = headphone;
        this.mouse = mouse;
    }

    //metodo para calcular precio basico de un pc
    public double calcularPrecio() {
        precioFinal = mouse + headphone + precioBase + 5;
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