package clase19liskov;

public class Persona implements IPagar {
    
    private String nombre;
    private String apellido;
    private int dni;
    private int tarjetaDebito;

    public Persona(
            String nombre, 
            String apellido, 
            int dni, 
            int tarjetaDebito
    ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.tarjetaDebito = tarjetaDebito;
    }
    
//    public void mostrarDatos() {
//        System.out.println(this.nombre + " " + this.apellido + " su numero de cuenta es: " + this.tarjetaDebito);
//    }
    
    @Override
    public void pagar() {
        
    }
    
    
    
}
