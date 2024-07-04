package clase16polimorfismo;

public class Perro extends Animal {
    
    private String nombre;
    
    // Constructores
    public Perro() {
        
    }

    public Perro(String nombre, String especie) {
        super(especie);
        this.nombre = nombre;
    }
    
    // Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Metodos
    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie();
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + '}';
    }
}
