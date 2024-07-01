package clase13;

public class AlumnoClase13 {
    
    private int id;
    private String nombre;
    private String apellido;

    // Constructor sin datos
    public AlumnoClase13() {
    }

    // Constructor con datos
    public AlumnoClase13(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Inicio Nuevos métodos
    public void mostrarNombre() {
        System.out.println(nombre + " " + apellido);
    }
    // Fin Nuevos métodos

    @Override
    public String toString() {
        return "Alumno Clase 13: " + id;
    }

}
