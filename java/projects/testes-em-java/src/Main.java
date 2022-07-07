import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double p1_x = scan.nextDouble();
        double p1_y = scan.nextDouble();

        double p2_x = scan.nextDouble();
        double p2_y = scan.nextDouble();

        double delta_x = p2_x-p1_x;
        double delta_y = p2_y-p1_y;
        double distance = Math.sqrt((delta_x*delta_x)+(delta_y*delta_y));

        System.out.printf("%.4f", distance);
    }
}
