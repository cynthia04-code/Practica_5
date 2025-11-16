package modulos;

public class Administrador extends Usuario {

    private String area;

    public Administrador(String nombre, int id, String area) {
        super(nombre, id);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    @Override
    public String mostrarInfo() {
        return "Administrador: " + nombre + " | ID: " + id + " | Área: " + area;
    }

    @Override
    public String toString() {
        return "Administrador," + nombre + "," + id + "," + area;
    }
}
