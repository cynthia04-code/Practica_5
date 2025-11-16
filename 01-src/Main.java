import modulos.*;
import utilidades.ManejadorLista.ManejadorLista;
import utilidades.ManejadorArchivos.ManejadorArchivos;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        if (args.length != 10) {
            System.out.println("Error: Debes proporcionar exactamente 10 nombres como argumentos de línea de comandos.");
            return;
        }

        ManejadorLista<Empleado> listaEmpleados = new ManejadorLista<>();
        ManejadorLista<Administrador> listaAdministradores = new ManejadorLista<>();
        int baseId = 1;
        String areaFija = "General";
        double salarioFijo = 4000.0;

        for (int i = 0; i < 10; i++) {
            listaEmpleados.agregar(new Empleado(args[i], baseId + i, salarioFijo));
            listaAdministradores.agregar(new Administrador(args[i], baseId + i, areaFija));
        }

        ArrayList<Empleado> tempEmp = new ArrayList<>(Arrays.asList(listaEmpleados.obtenerTodos()));
        Collections.reverse(tempEmp);

        ArrayList<Administrador> tempAdmin = new ArrayList<>(Arrays.asList(listaAdministradores.obtenerTodos()));
        Collections.reverse(tempAdmin);

        String[] empRevertidos = tempEmp.stream()
                                        .map(Empleado::toString)
                                        .toArray(String[]::new);

        String[] adminRevertidos = tempAdmin.stream()
                                            .map(Administrador::toString)
                                            .toArray(String[]::new);

        ManejadorArchivos.escribirArregloAArchivo(empRevertidos, "01-src/04-BD/01-Empleados.txt");
        ManejadorArchivos.escribirArregloAArchivo(adminRevertidos, "01-src/04-BD/02-Administradores.txt");

        Empleado nuevoEmpleado = new Empleado("NuevoEmp", 11, 6000.0);
        Administrador nuevoAdministrador = new Administrador("NuevoAdmin", 11, "Ventas");
        
        ManejadorArchivos.escribirLineaAlFinal(nuevoEmpleado.toString(), "01-src/04-BD/01-Empleados.txt");
        ManejadorArchivos.escribirLineaAlFinal(nuevoAdministrador.toString(), "01-src/04-BD/02-Administradores.txt");
        
        System.out.println("--- Lista de 11 Administradores ---");
        String[] lineasAdmin = ManejadorArchivos.leerArchivoComoArreglo("01-src/04-BD/02-Administradores.txt");
        
        for (String linea : lineasAdmin) {
            String[] partes = linea.split(",");
            if (partes.length == 4 && partes[0].equals("Administrador")) {
                Administrador a = new Administrador(partes[1], Integer.parseInt(partes[2]), partes[3]);
                System.out.println(a.mostrarInfo());
            }
        }

        System.out.println("\n--- Lista de 11 Empleados ---");
        String[] lineasEmp = ManejadorArchivos.leerArchivoComoArreglo("01-src/04-BD/01-Empleados.txt");

        for (String linea : lineasEmp) {
            String[] partes = linea.split(",");
            if (partes.length == 4 && partes[0].equals("Empleado")) {
                Empleado e = new Empleado(partes[1], Integer.parseInt(partes[2]), Double.parseDouble(partes[3]));
                System.out.println(e.mostrarInfo());
            }
        }
    }
}
