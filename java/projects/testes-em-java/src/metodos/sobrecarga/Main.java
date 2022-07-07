package metodos.sobrecarga;

public class Main {
    public static void main(String[] args) {
        System.out.println("Area do quadrado (a=2): " + CalcularArea.calcular(2));
        System.out.println("Area do retangulo (a=2, b=3): " + CalcularArea.calcular(2, 3));
        System.out.println("Area do trapezio (a=2, b=3, h=4): " + CalcularArea.calcular(2, 3, 4));
    }
}
