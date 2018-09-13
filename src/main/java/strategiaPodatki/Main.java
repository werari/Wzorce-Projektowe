package strategiaPodatki;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Context context = new Context();
//TODO dopisać context
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cenę netto");
        Float priceNetto= scanner.nextFloat();
        Tax tax= new TaxUSA();
        Float priceBrutto =tax.countingTax(priceNetto);
        System.out.println("Cena brutto " + priceBrutto);
    }
}
