package clase17;

public class Contratado extends Trabajador {
    
    private String fechaIngreso;
    private int salarioMensual;
    
    public Contratado() {
        
    }

    public Contratado(
            String fechaIngreso, 
            int salarioMensual, 
            String nombres, 
            String apellidos, 
            String run, 
            int telefono, 
            int edad
    ) {
        super(nombres, apellidos, run, telefono, edad);
        this.fechaIngreso = fechaIngreso;
        this.salarioMensual = salarioMensual;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(int salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Fecha de ingreso: " + this.fechaIngreso);
        System.out.println("Salario mensual: " + this.salarioMensual);
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Contratado{" 
                + "fechaIngreso=" + fechaIngreso 
                + ", salarioMensual=" + salarioMensual + '}';
    }
    
    
    
    
    
}
