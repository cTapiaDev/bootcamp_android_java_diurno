package clase16claseabstracta;

public class Gerente extends Empleado {

    public Gerente(String nombre, int salario) {
        super(nombre, salario);
    }
    
    @Override
    public void trabajar() {
        System.out.println("El gerente " + nombre + " esta supervisando a los trabajadores");
    }
    
//    @Override
//    public void mostrarDatos() {
//        super.mostrarDatos();
//        System.out.println("la estoy llamando desde la clase hija");
//    }

    
     
    
}
