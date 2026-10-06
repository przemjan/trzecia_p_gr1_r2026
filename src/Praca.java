public class Praca {
    public static void main(String[] args) {
        int workHours = 8;
        int workDaysPerWeek = 5;
        int workWeeksPerYear = 52;
        int workPerYear = workHours * workDaysPerWeek * workWeeksPerYear;
        System.out.println("Godziny pracujące w roku: " + workPerYear);
        int wolne = workPerYear;
    }
}
