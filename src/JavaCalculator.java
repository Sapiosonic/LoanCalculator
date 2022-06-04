import java.util.Scanner;
public class JavaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inform the loan's amount: ");
        int amount = scanner.nextInt();

        for(int i = 1; i <= 3; i++){
            amount = (amount)* 90 / 100;
            System.out.println(amount);
        }
    }
}

