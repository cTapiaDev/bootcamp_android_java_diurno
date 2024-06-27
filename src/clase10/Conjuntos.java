package clase10;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
    
    public static void main(String[] args) {
        
        // Crear conjunto
        Set<String> ciudades = new HashSet<>();
        
        // Agregar elementos
        ciudades.add("Santiago");
        ciudades.add("Rancagua");
        ciudades.add("Temuco");
        ciudades.add("Santiago");
        
        // Verificar si existe
        System.out.println(ciudades.contains("Talca"));
        
        // Eliminar un elemento
        ciudades.remove("Rancagua");
        
        // Recorrer el conjunto
        for (String e : ciudades) {
            System.out.println(e);
        }
        
//        // Vaciar el conjunto
        ciudades.clear();

//        Set<Integer> conjunto1 = new HashSet<>();
//        Set<Integer> conjunto2 = new HashSet<>();
//        
//        conjunto1.add(1);
//        conjunto1.add(2);
//        conjunto1.add(3);
//        
//        conjunto2.add(2);
//        conjunto2.add(3);
//        conjunto2.add(4);
//        
//        conjunto1.retainAll(conjunto2);
//        
//        for(Integer e: conjunto1) {
//            System.out.println(e);
//        }
        
        
    }
    
}
