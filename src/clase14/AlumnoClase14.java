package clase14;

public class AlumnoClase14 {
    
    private int id;
    private String nombre;
    private String apellido;

    // Constructor sin datos
    public AlumnoClase14() {
    }

    // Constructor con datos
    public AlumnoClase14(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
//    // Inicio Getters
//    public int getId() {
//        return id;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public String getApellido() {
//        return apellido;
//    }
//    // Fin Getters
//    
//    
//    // Inicio Setters
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }
//    // Fin Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    // Inicio Nuevos métodos
    public void mostrarNombre() {
        System.out.println(nombre + " " + apellido);
    }
    // Fin Nuevos métodos

    @Override
    public String toString() {
        return "Alumno Clase 14: " + id;
    }
    
}
