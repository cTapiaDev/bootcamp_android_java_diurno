package clase19dependencias;

public class MotorGasolina implements Motor {

    @Override
    public void arrancar() {
        System.out.println("Motor a gasolina esta encendido");
    }
    
}
