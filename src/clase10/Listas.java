package clase10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Listas {
    
    public static void main(String[] args) {
        
        // Crear lista
        List<String> ciudades = new ArrayList<>();
        
        // Agregar elementos
        ciudades.add("Talca");
        ciudades.add("Santiago");
        ciudades.add("Iquique");
        ciudades.add("Linares");
        ciudades.add("Punta Arenas");
        
        // Obtener tamaño de la lista
        System.out.println(ciudades.size());
        
        // Obtener un elemento
        System.out.println(ciudades.get(1));
        
        // Eliminar un elemento
        ciudades.remove(1);
     
        // Ordenar la lista
        Collections.sort(ciudades);

        // Modificar un elemento
        ciudades.set(1, "Antofagasta");

        // Mostrar elementos
        for (String e : ciudades) {
            System.out.println(e);
        }


        /*** EJERCICIO DE LISTAS ***/
        /*
            - Crea una lista de 10 números ingresados al azar.
            - Ordena la lista.
            - Pide al usuario que ingrese un número 
              límite inferior y otro superior.
            - Considerando el límite, elimina todos
              los elementos de la lista que no se
              encuentren dentro de su rango o
              almacenalos en una nueva lista.
        */
        
//        List<Integer> numeros = new ArrayList<>();
//        List<Integer> nuevaLista = new ArrayList<>();
//        Scanner input = new Scanner(System.in);
//        
//        for (int i = 0; i < 10; i++) {
//            int nRandom = (int) (Math.random() * 100);
//            numeros.add(nRandom);
//        }
//        
//        System.out.println("------------------");
//        
//        Collections.sort(numeros);
//        
//        for (Integer e : numeros) {
//            System.out.println(e);
//        }
//        
//        System.out.println("Ingresa el numero inferior del rango: ");
//        int nInferior = input.nextInt();
//        
//        System.out.println("Ingresa el numero mayor del rango: ");
//        int nSuperior = input.nextInt();
//        
//        System.out.println("------------------");
//
//        for (Integer e : numeros) {
//            if (e >= nInferior && e <= nSuperior) {
//                nuevaLista.add(e);
//            }
//        }
//        
//        for (int i = numeros.size() - 1; i >= 0; i--) {
//            if (numeros.get(i) < nInferior || numeros.get(i) > nSuperior) {
//                numeros.remove(i);
//            }
//        }
//
//        System.out.println("Nueva Lista");
//        for (Integer e : nuevaLista) {
//            System.out.println(e);
//        }
//        
//        System.out.println("------------------");
//        
//        System.out.println("Misma Lista");
//        for (Integer e : numeros) {
//            System.out.println(e);
//        }
     
    }
    
}
