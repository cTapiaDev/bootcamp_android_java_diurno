package clase17;

public class Honorario extends Trabajador {
    
    private int giro;
    private int anioIniciacion;

    public Honorario() {
    }

    public Honorario(
            int giro, 
            int anioIniciacion, 
            String nombres, 
            String apellidos, 
            String run, 
            int telefono, 
            int edad
    ) {
        super(nombres, apellidos, run, telefono, edad);
        this.giro = giro;
        this.anioIniciacion = anioIniciacion;
    }

    public int getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        this.giro = giro;
    }

    public int getAnioIniciacion() {
        return anioIniciacion;
    }

    public void setAnioIniciacion(int anioIniciacion) {
        this.anioIniciacion = anioIniciacion;
    }
    
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Año iniciacion: " + this.anioIniciacion);
        System.out.println("Giro: " + this.giro);
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Honorario{" + "giro=" + giro 
                + ", anioIniciacion=" + anioIniciacion + '}';
    }
    
    
    
    
    
}
