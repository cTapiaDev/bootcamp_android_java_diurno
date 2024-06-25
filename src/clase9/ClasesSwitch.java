package clase9;

import java.util.Scanner;

public class ClasesSwitch {
    
    public static void main(String[] args) {
        
//        Scanner input = new Scanner(System.in);
//        
//        int num;
//        
//        System.out.println("");
//        System.out.println("Ingresa un número: ");
//        num = input.nextInt();
        
        
//        switch(num) {
//            case 1:
//                System.out.println("Lunes");
//                break;
//            case 2:
//                System.out.println("Martes");
//                break;
//            case 3:
//                System.out.println("Miercoles");
//                break;
//            case 4:
//                System.out.println("Jueves");
//                break;
//            case 5:
//                System.out.println("Viernes");
//                break;
//            case 6:
//                System.out.println("Sabado");
//                break;
//            case 7:
//                System.out.println("Domingo");
//                break;
//            default:
//                System.out.println("Ingresa un valor valido");
//                break;
//        }


/***** ESTRUCTURA SWITCH NUEVA *****/

//       switch(num) {
//            case 1 -> System.out.println("Lunes");
//            case 2 -> {
//                System.out.println("Martes");
//                System.out.println("Es un nuevo dia");
//            }
//            case 3 -> System.out.println("Miercoles");
//            case 4 -> System.out.println("Jueves");
//            case 5 -> System.out.println("Viernes");
//            case 6 -> System.out.println("Sabado");
//            case 7 -> System.out.println("Domingo");
//            default -> System.out.println("Ingresa un valor valido");
//        }


/*** Ejercicio Dias de la Semana ***/

    /* 
    - Pide al usuario que ingrese el nombre del día de la semana.
    - Devuelve por consola una respuesta correspondiente a:
        - Inicio de Semana.
        - Mediados de semana.
        - Último día de la semana.
        - Fin de semana.
    - Ten en cuenta que el usuario puede ingresar el nombre tanto en
      mayúsculas como minúsculas.
    */
    
    Scanner input = new Scanner(System.in);
    
    String dato;
    
    System.out.println("Ingresa un dia de la semana: ");
    dato = input.nextLine().toLowerCase();
    
    switch(dato) {
        case "lunes":
            System.out.println("Inicio de semana");
            break;
        case "martes", "miercoles", "jueves":
            System.out.println("Mediados de semana");
            break;
        case "viernes":
            System.out.println("Ultimo dia de la semana");
            break;
        case "sabado", "domingo":
            System.out.println("Fin de semana");
            break;
        default:
            System.out.println("El dato ingresado no corresponde");
            break;
    }

//    switch(dato) {
//        case "lunes" -> System.out.println("Inicio de semana");
//        case "martes", "miercoles", "jueves" -> System.out.println("Mediados de semana");
//        case "viernes" -> System.out.println("Ultimo dia de la semana");
//        case "sabado", "domingo" -> System.out.println("Fin de semana");
//        default -> System.out.println("El dato ingresado no corresponde");
//    }
  
        
    }
    
}
