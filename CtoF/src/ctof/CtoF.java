package ctof;
import java.util.Scanner;
public class CtoF {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        double c, f;
        
        System.out.println("digite o valor em graus Celcius: ");
        
        c = in.nextInt();
        
        f = (9*c + 160)/5;
        
        System.out.println("Valor em Fahrenheit: " + f);
        
    }
    
}
