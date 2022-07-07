package metodos.sobrecarga;

public class CalcularArea {
    public static double calcular(double a){
        return Math.pow(a, 2);
    }

    public static double calcular(double a, double b){
        return a * b;
    }

    public static double calcular(double a, double b, double h){
        return ((a+b)*h)/2;
    }
}
