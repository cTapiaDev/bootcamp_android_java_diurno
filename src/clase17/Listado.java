package clase17;

import java.util.ArrayList;
import java.util.List;

public class Listado {
    
    List<Trabajador> lista = new ArrayList<>();
    
    public void agregarTrabajador(Trabajador empleado) {
        lista.add(empleado);
    }
    
    public void mostrarDatosTrabajadores() {
        for (Trabajador e : lista) {
            e.mostrarDatos();
        }
    }
    
}
