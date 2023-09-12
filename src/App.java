public class App {
    public static void main(String[] args) {
        printBonusDatesBetween(2010, 2015);
    }

    public static void printBonusDatesBetween(int fromYear, int toYear) {
        for (int year = fromYear; year <= toYear; year++) {
            for (int month = 1; month <= 12; month++) {
                for (int day = 1; day <= 31; day++) {
                    String dateStr = String.format("%04d%02d%02d", year, month, day);
                    String reversedDateStr = new StringBuilder(dateStr).reverse().toString();
                    if (dateStr.equals(reversedDateStr)) {
                        System.out.printf("%04d-%02d-%02d%n", year, month, day);
                    }
                }
            }
        }
    }
}