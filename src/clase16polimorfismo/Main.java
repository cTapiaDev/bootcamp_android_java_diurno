package clase16polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        Animal miMascota1 = new Perro("Pluto", "Perro");
        Animal miMascota2 = new Gato("Gardfield", "Gato");
        
        miMascota1.mostrarEspecie();
        
        List<Animal> mascotas = new ArrayList<>();
        
        mascotas.add(miMascota1);
        mascotas.add(miMascota2);
        
        for (Animal e : mascotas) {
            System.out.println(e);
        }
        
        
        
    }
    
}
