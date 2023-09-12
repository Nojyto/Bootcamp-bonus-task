import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        printBonusDatesBetween(2010, 2015);
    }

    public static void printBonusDatesBetween(int fromYear, int toYear) {
        final DateTimeFormatter formatterDisplay = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        final DateTimeFormatter formatterValidate = DateTimeFormatter.ofPattern("yyyyMMdd");

        final LocalDate startDate = LocalDate.of(fromYear, 1, 1);
        final LocalDate endDate = LocalDate.of(toYear, 1, 1);

        for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
            String formattedDate = date.format(formatterValidate);
            String reversedDate = new StringBuilder(formattedDate).reverse().toString();
            
            if (formattedDate.equals(reversedDate)) {
                System.out.println(date.format(formatterDisplay));
            }
        }
    }
}