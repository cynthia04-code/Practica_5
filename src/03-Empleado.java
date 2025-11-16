package modulos;

public class Empleado extends Usuario {

    private double salario;

    public Empleado(String nombre, int id, double salario) {
        super(nombre, id);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String mostrarInfo() {
        return "Empleado: " + nombre + " | ID: " + id + " | Salario: " + salario;
    }

    @Override
    public String toString() {
        return "Empleado," + nombre + "," + id + "," + salario;
    }
}
