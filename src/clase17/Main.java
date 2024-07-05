package clase17;

public class Main {
    
    public static void main(String[] args) {
        
        Trabajador trabajador1 = new Trabajador(
                "Pedrito", 
                "Rodriguez",
                "1232412-2", 
                123512, 
                20
        );
        
        Trabajador trabajador2 = new Trabajador(
                "Juanito", 
                "Perez",
                "1232412-2", 
                123512, 
                50
        );
        
        Trabajador trabajador3 = new Trabajador(
                "Speedy", 
                "Gonzalez",
                "1232412-2", 
                123512, 
                25
        );
        
        Trabajador trabajador4 = new Honorario(
                500000, 
                2020, 
                "Michael", 
                "Jackson", 
                "123123-2", 
                12312412,
                35
        );
        
        Trabajador trabajador5 = new Contratado(
                "2021", 
                500000, 
                "Tom", 
                "Santos", 
                "1231242-2", 
                1241231, 
                40
        );
        
        Listado listaTrabajadores = new Listado();
        
        // Agregar 5 trabajadores
        listaTrabajadores.agregarTrabajador(trabajador1);
        listaTrabajadores.agregarTrabajador(trabajador2);
        listaTrabajadores.agregarTrabajador(trabajador3);
        listaTrabajadores.agregarTrabajador(trabajador4);
        listaTrabajadores.agregarTrabajador(trabajador5);
        
        // Mostrar datos de el metodo mostrarDatos() de los trabajadores
        listaTrabajadores.mostrarDatosTrabajadores();
        
        
        
    }
    
}
