package clase16polimorfismo;

public class Animal {
    
    private String especie;
    
    
    // Constructores
    public Animal() {
        
    }

    public Animal(String especie) {
        this.especie = especie;
    }
    
    // Getters and Setters

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    // Metodo
    public void mostrarEspecie() {
        System.out.println("Soy un animal de la especie: " + this.getEspecie());
    }

    @Override
    public String toString() {
        return "Animal{" + "especie=" + especie + '}';
    }
    
}
