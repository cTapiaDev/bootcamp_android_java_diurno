package clase19liskov;

public class Ninio implements IPagar {
    
    private String nombre;
    private String apellido;

    @Override
    public void pagar() {
        System.out.println("Soy menor de edad y no tengo tarjeta");
    }
    
    
   
}
