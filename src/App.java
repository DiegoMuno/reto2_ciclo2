import model.Computador;
import model.ComputadorPortatil;

public class App {
    public static void main(String[] args) throws Exception {
        
        ComputadorPortatil portatil = new ComputadorPortatil();

        Computador pc = new Computador();

        System.out.println(portatil.calcularPrecio());//ultimo punto de trabajo haciendo pruebas video 22 julio 1:48 horas
        
    }
}
