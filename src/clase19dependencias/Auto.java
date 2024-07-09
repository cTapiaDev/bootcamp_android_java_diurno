package clase19dependencias;

public class Auto {
    
    private Motor motor;
    
    public Auto(Motor motor) {
        this.motor = motor;
    }
    
    public void mover() {
        motor.arrancar();
        System.out.println("El auto se esta moviendo");
    }
    
}
