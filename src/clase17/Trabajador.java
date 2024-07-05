package clase17;

public class Trabajador implements ICorredora {
    
    private String nombres;
    private String apellidos;
    private String run;
    private int telefono;
    private int edad;

    public Trabajador() {
    }

    public Trabajador(
            String nombres, 
            String apellidos, 
            String run, 
            int telefono, 
            int edad
    ) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }
    
    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }
    
    public int descomponerRun() {
        String nuevaCadena = this.run.substring(0, this.run.length() - 2);
        int numRun = Integer.parseInt(nuevaCadena);
        return numRun;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Edad: " + this.edad);
        System.out.println("-----");
    }

    @Override
    public String toString() {
//        return "Trabajador{" 
//                + "nombres=" + nombres 
//                + ", apellidos=" + apellidos 
//                + ", run=" + run 
//                + ", telefono=" + telefono 
//                + ", edad=" + edad + '}';
        return "Trabajador " + nombres + " " + apellidos;
    }
    
    
    
}
