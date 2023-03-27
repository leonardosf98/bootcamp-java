import java.io.IOException;
import java.util.Scanner;

public class DIO {
	
  public static void main(String[] args) throws IOException {
     Scanner leitor = new Scanner(System.in);
     
     double media = 0;
     double resultado = 0;
     int count = 0;
    
      
        for (int cont = 0; cont < 6; cont++ ) {
            double valorDigitado = leitor.nextDouble();
        	    if (valorDigitado > 0){
                    resultado += valorDigitado;
                    count++;
            } 
        }

        media = resultado / count;
        
        System.out.println(count + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
	
}