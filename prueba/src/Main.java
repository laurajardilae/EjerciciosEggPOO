import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2023,11,20);

        String dia = fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US);
        System.out.println(dia);
    }
}