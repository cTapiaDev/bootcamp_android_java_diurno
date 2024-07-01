package clase10;

//import java.util.Scanner;

public class Arreglos {
    
    public static void main(String[] args) {
        
        /*** ARREGLOS ***/
        
        String ciudades[] = new String[3];
        
        System.out.println(ciudades.length);
        
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

//        String nombres[] = new String[5];
        String nombres[] = {"Juanito", "Pedrito", "Tom", "Jerry", "Lucas"};
        
        for (String e : nombres) {
            System.out.println(e);
        }
                
        
    }
    
}
