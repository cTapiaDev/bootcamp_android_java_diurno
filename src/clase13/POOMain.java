package clase13;

public class POOMain {
    
    public static void main(String[] args) {
        
        AlumnoClase13 alumno1 = new AlumnoClase13(10, "Michael", "Jackson");
        AlumnoClase13 alumno2 = new AlumnoClase13(2, "Pedrito", "Santos");
        
//        alumno1.mostrarNombre();
//        alumno2.mostrarNombre();

        alumno1.mostrarNombre();
        
//        System.out.println(alumno1);

        String datoGuardado = alumno1.toString();

        System.out.println(datoGuardado);
        System.out.println(alumno2);
        
        
        
    }
    
}
