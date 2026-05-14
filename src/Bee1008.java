import java.util.Scanner;

public class Bee1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int hours = sc.nextInt();
        double salary = sc.nextDouble();

        System.out.println("NUMBER = " + number);
        System.out.println(String.format("SALARY = U$ %.2f", hours * salary));
    }
}