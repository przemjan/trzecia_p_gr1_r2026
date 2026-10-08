import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class zadanie_na_6 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("zadanieNa6.txt");
        String text= """
               Przerób tak zadanie z liczbami rzymskimi, aby obejmowało cały zakres
               liczb rzymskich (od 1 do 3999). Program powinien działać w obie strony
               (z arabskich na rzymskie i z rzymskich na arabskie) i dawać użytkownikowi 
               możliwość wyboru kierunku konwersji.
               Zadbaj o walidację -- program powinien sprawdzać poprawność danych wejściowych.
               """;
        pw.println(text);
        pw.close();
    }

}
