package clase17;

public class Eventual extends Trabajador {
    
    private String disponibilidad;
    private String email;
    
    public Eventual() {
        
    }

    public Eventual(
            String disponibilidad, 
            String email, 
            String nombres, 
            String apellidos, 
            String run, 
            int telefono, 
            int edad
    ) {
        super(nombres, apellidos, run, telefono, edad);
        this.disponibilidad = disponibilidad;
        this.email = email;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Disponibilidad: " + this.disponibilidad);
        System.out.println("Email: " + this.email);
    }

    @Override
    public String toString() {
        return "Eventual{" 
                + "disponibilidad=" + disponibilidad 
                + ", email=" + email + '}';
    }
    
    
    
    
    
}
