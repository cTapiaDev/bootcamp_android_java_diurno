package clase19dependencias;

public class MotorElectrico implements Motor {

    @Override
    public void arrancar() {
        System.out.println("Motor electrico esta encendido");
    }
    
}
