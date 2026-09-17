import java.util.Scanner;
import java.util.Locale;
import util.CurrencyConverter;


void main() {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    CurrencyConverter calc = new CurrencyConverter();

    System.out.print("What is the dollar price? ");
    calc.price = sc.nextDouble();

    System.out.print("How many dollars will be bought? ");
    calc.dollar = sc.nextDouble();

    System.out.printf("Amount to be paid in reais = %.2f%n", calc.discount());
}

