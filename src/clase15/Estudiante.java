package clase15;

public class Estudiante {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String tipoSangre;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int edad, String tipoSangre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tipoSangre = tipoSangre;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getTipoSangre() {
       return tipoSangre; 
    }
    
    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    
    

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
}
