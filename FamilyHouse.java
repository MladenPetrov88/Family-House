import java.util.Scanner;

public class FamilyHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double tokPrice = 0;
        for (int i = 1; i <= months; i++) {
            double tok = Double.parseDouble(scanner.nextLine());
            tokPrice += tok;
        }
        double waterPrice = 20 * months;
        double internetPrice = 15 * months;
        double totalPrice = tokPrice + waterPrice + internetPrice;
        double otherPrice = totalPrice + totalPrice * 0.20;
        double averaage = (tokPrice + internetPrice + waterPrice + otherPrice) / months;
        System.out.printf("Electricity: %.2f lv%n",tokPrice);
        System.out.printf("Water: %.2f lv%n",waterPrice);
        System.out.printf("Internet: %.2f lv%n",internetPrice);
        System.out.printf("Other: %.2f lv%n", otherPrice);
        System.out.printf("Average: %.2f lv", averaage);
    }
}
