package modulos;

public abstract class Usuario {
    protected String nombre;
    protected int id;

    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public abstract String mostrarInfo();

    @Override
    public String toString() {
        return nombre + "," + id;
    }
}
