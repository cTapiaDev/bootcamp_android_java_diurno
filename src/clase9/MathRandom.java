
package clase9;

public class MathRandom {
    
    public static void main(String[] args) {
//        double number = 30;
//        double rNumber = Math.random() * number;
//        
//        System.out.println(rNumber);

//          int rNumber = (int) (Math.random() * (10 - 20) + 30);
//          System.out.println(rNumber);

        double rNumber = Math.random() * 10;
        double roundedN = Math.floor(rNumber * 100) / 100;
        
        System.out.println(roundedN);
          
          
    }
    
}
