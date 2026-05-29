import java.util.Scanner;

public class Bee1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();

        System.out.println(String.format("TOTAL = R$ %.2f", (salario + (vendas * 0.15))));
    }
}