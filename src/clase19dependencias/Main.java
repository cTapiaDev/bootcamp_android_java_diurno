package clase19dependencias;

public class Main {
    
    public static void main(String[] args) {
        
        Auto auto1 = new Auto(new MotorElectrico());
        Auto auto2 = new Auto(new MotorGasolina());
        
        auto1.mover();
        auto2.mover();
        
    }
    
}
