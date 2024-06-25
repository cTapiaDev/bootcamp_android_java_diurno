
package clase9;

import java.util.Scanner;

public class ClaseCiclos {
    
    public static void main(String[] args) {
        
    /*** CICLO WHILE ***/    
        
//        int a = 0;
//        int b = 9;
//        
//        while (a <= b) {
//            System.out.println(a);
//            a++;
//        }



    /*** CICLO DO-WHILE ***/
    
//    int x = 0;
//    
//    do {
//        System.out.println(x);
//        x++;
//    } while (x == 0);



    /*** CICLO FOR ***/
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

        /*** CICLO FOR-EACH ***/
//        String[] semana = {"lunes", "martes", "miercoles", "jueves", "viernes"};
//
//        for (String e : semana) {
//            System.out.println(e);
//        }


//        Scanner input = new Scanner(System.in);
//        
//        int num;
//        
//        do {
//            System.out.println("Ingresa un numero mayor o igual a cero");
//            num = input.nextInt();
//            
//        } while (num < 0);
//        
//        System.out.println("Perfecto, el numero ingresado es mayor o  a 0");
        

        Scanner input = new Scanner(System.in);
        
        int contador = 0;
        int random;
        
        System.out.println("Ingresa el numero menor del rango");
        int nMenor = input.nextInt();
        
        System.out.println("Ingresa el numero mayor del rango");
        int nMayor = input.nextInt();
        
        while (contador < 5) {
            random = (int) (Math.random() * (nMayor - nMenor) + nMenor);
            System.out.println(random);
            contador++;
        }
        
    }
}
