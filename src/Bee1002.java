import java.util.Scanner;

public class Bee1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double area = 3.14159 * (raio * raio);

        System.out.printf("A=%.4f%n", area);
    }
}
