package clase16claseabstracta;

public abstract class Empleado {
    
    private String nombre;
    private int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public abstract void trabajar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void mostrarDatos() {
        System.out.println(this.getNombre() + " - " + this.getSalario());
    }
    
}
