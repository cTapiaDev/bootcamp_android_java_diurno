package clase14;

public class POOMain {
    
    public static void main(String[] args) {
        
        AlumnoClase14 alumno1 = new AlumnoClase14();
        AlumnoClase14 alumno2 = new AlumnoClase14(1, "Pedrito", "Soto");
        
        System.out.println(alumno2.getNombre());
        
        alumno1.setNombre("Corre Caminos");
        
        alumno2.setNombre("Juanito");
        
        System.out.println(alumno1.getApellido());
        
        
    }
    
}
