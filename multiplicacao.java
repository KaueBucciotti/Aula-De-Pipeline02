public class Calculadora {

    // O equivalente à sua function multiplicacao
    public int multiplicacao(int a, int b) {
        return a * b;
    }

    // Método principal para testar o código
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicacao(5, 4);
        
        System.out.println("O resultado é: " + resultado);
    }
}