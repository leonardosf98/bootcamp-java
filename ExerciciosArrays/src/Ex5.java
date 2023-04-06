import java.util.Scanner;
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        System.out.println("Digite um valor para ser calculada sua tabuada!");
        numero = ler.nextInt();
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + " X " + i + " = " + (i * numero));
        }
    }
}