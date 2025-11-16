import modulos.*;
import utilidades.ManejadorLista.ManejadorLista;

public class Main {
    public static void main(String[] args) {

        ManejadorLista<Usuario> lista = new ManejadorLista<>();

        lista.agregar(new Empleado("Juan", 1, 5000));
        lista.agregar(new Administrador("Ana", 2, "Sistemas"));

        Usuario u = lista.buscarPorId(2);
        if (u != null) {
            System.out.println(u.mostrarInfo());
        }
    }
}
