package clase10;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    
    public static void main(String[] args) {
        
        // Crear un mapa
        Map<Integer, String> ciudades = new HashMap<>();
        
        // Agregar dato
        ciudades.put(1, "Talca");
        ciudades.put(2, "Santiago");
        ciudades.put(3, "Linares");
        
        // Obtener un valor
        System.out.println(ciudades.get(6));
        
        // Verificar existencia de clave
        System.out.println(ciudades.containsKey(1));
        
        // Eliminar dato
        ciudades.remove(3);
        
        // Recorrer un mapa
        for (Map.Entry<Integer, String> e : ciudades.entrySet()) {
            System.out.println(e);
        }
        
    }
}
