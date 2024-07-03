package clase15;

public class Hufflepuff extends Estudiante implements IConjuros {
    
    private String nombreProfesor;
    private String hechizoPrincipal;

    // Constructor IDE
    public Hufflepuff() {
    }

    public Hufflepuff(
            String nombreProfesor, 
            String hechizoPrincipal, 
            String nombre, 
            String apellido, 
            int edad, 
            String tipoSangre
    ) {
        super(nombre, apellido, edad, tipoSangre); // Construccion automatica
        this.nombreProfesor = nombreProfesor;
        this.hechizoPrincipal = hechizoPrincipal;
    }

    // Getters and Setters
    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getHechizoPrincipal() {
        return hechizoPrincipal;
    }

    public void setHechizoPrincipal(String hechizoPrincipal) {
        this.hechizoPrincipal = hechizoPrincipal;
    }

    // Metodo toString IDE
    @Override
    public String toString() {
        return "Hufflepuff{" + "nombreProfesor=" + nombreProfesor + ", hechizoPrincipal=" + hechizoPrincipal + '}';
    }

    
    // Metodos de IConjuros
    @Override
    public void levitar() {
        // Bloque de codigo del metodo
    }

    @Override
    public void accio() {
        // Bloque de codigo del metodo
    }
    
    
    
    
    
}
