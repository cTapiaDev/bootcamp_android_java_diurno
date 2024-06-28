package clase12;

import java.util.Scanner;

public class Debug {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa la edad:");
        int edad = input.nextInt();
        
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad");
        } else if (edad < 18) {
            System.out.println("La persona es menor de edad");
        }
        
    }
    
}
