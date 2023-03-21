public class TesteFatorial {
    public static void main(String[] args) {
        int numeroEscolhido = 10;
        int resultado = 1;
        for (int contador = 1; contador <= numeroEscolhido; contador++) {
            resultado = resultado * contador;
            System.out.println(resultado);
        }
    }
}
