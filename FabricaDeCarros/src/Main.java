import java.util.*;

public class Main{

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
	    int porcentagemDistribuidor = scan.nextInt();
	    int percentualImpostos = scan.nextInt();
        scan.close();

            int custoConsumidor;
     
            int valorDistribuidor;
            int valorImpostos;
 
        
        valorDistribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        valorImpostos = (custoFabrica * percentualImpostos) / 100;

        custoConsumidor = custoFabrica + valorImpostos + valorDistribuidor;

        
      
 
        System.out.println(custoConsumidor);
	}
}
