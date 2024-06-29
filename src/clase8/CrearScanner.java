package clase8;

import java.util.Scanner;

public class CrearScanner {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        String nombre = input.next();
        
        System.out.println(nombre);
        
        input.close();
    }
}
