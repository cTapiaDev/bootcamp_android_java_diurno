package pruebaPOO;

import clase14.AlumnoClase14;

public class POOMainPrueba {
    
    public static void main(String[] args) {
        
        AlumnoClase14 alumno1 = new AlumnoClase14(300, "Juanito", "Rodriguez");
        
        System.out.println(alumno1.toString());
        
        System.out.println(alumno1.getId());
    }
    
}
