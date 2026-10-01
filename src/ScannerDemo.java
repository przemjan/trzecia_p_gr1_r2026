import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner mojScanner = new Scanner(System.in);

        int numerButa;
        System.out.println("Podaj numer buta:");
        numerButa = mojScanner.nextInt();
        mojScanner.nextLine();

        System.out.println("Podaj średnią z matmy:");
        double average = mojScanner.nextDouble();
        mojScanner.nextLine();

        System.out.println("Podaj imię:");
        String name = mojScanner.nextLine();

        System.out.println("Twój numer: " + numerButa +
                ", średnia: " + average + ", imię: " + name);
    }
}
