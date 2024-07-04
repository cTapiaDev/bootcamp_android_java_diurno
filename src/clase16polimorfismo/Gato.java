package clase16polimorfismo;

public class Gato extends Animal {
    
    private String nombre;

    // Constructor
    public Gato() {
        
    }

    public Gato(String nombre, String especie) {
        super(especie);
        this.nombre = nombre;
    }
    
    // Getter and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + '}';
    }
    
}
