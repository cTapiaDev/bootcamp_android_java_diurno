package clase10;

import java.util.Scanner;

public class Arreglos {
    
    public static void main(String[] args) {
        
        /*** ARREGLOS ***/
        
//        Scanner input = new Scanner(System.in);
//        
//        int edad[] = new int[3];
//        
//        System.out.println(edad.length);
//       
//        for (int i = 0; i < edad.length; i++) {
//            System.out.println("Ingresa una edad");
//            edad[i] = input.nextInt();
//        }
//        
//        for (int i = 0; i < edad.length; i++) {
//            System.out.println(edad[i]);
//        }

//        String nombre[] = new String[5];
//       
//        nombre[0] = "Juanito";
//        nombre[1] = "Pedrito";
//        nombre[2] = "Tom";
//        nombre[3] = "Jerry";
//        nombre[4] = "Lucas";
        
        String nombre[] = {"Juanito", "Pedrito", "Tom", "Jerry", "Lucas"};
        
        for (String e : nombre) {
            System.out.println(e);
        }
                
        
    }
    
}
