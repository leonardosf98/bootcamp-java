public class TesteMultiploDe3 {

    public static void main(String[] args) {

        int resultado = 0;
        while (resultado <= 100) {
            if (resultado % 3 == 0) {
                System.out.println(resultado);
            }
            resultado++;
        }
    }
}