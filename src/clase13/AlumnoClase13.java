package clase13;

/**
 * Clase 13 de POO.
 * 
 * @author carlos
 * @version 1.2.2
 */

public class AlumnoClase13 {
    
    private int id;
    private String nombre;
    private String apellido;

    // Constructor sin datos
    public AlumnoClase13() {
    }

    /**
     * Constructor de Alumnos.
     * 
     * @param id id de alumno
     * @param nombre nombre del alumno
     * @param apellido apellido del alumno
     */
    // Constructor con datos
    public AlumnoClase13(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Me muestra el nombre y apellido del alumno.
     * 
     */
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
