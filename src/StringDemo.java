public class StringDemo {

    public static void main(String[] args) {
        String name = "Tadeusz";

        int dlugoscImienia = name.length();
        char inicjal = name.charAt(0);

        System.out.println("Litera: " + inicjal);

        String male, duze;

        duze = name.toUpperCase();
        male = name.toLowerCase();

        System.out.println(name);
    }
}
