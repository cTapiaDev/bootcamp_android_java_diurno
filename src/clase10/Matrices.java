package clase10;

public class Matrices {
    
    public static void main(String[] args) {
        
        int matriz[][] = new int[3][6];
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 9);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        
    }
    
    
}
