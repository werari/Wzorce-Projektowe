package strategiaPodatki;

import java.util.Scanner;

public class TaxDE {

    Scanner scanner = new Scanner(System.in);
    Float priceNetto= scanner.nextFloat();

    public Float getGetPriceBrutto() {
        return priceNetto;
    }

    public Float getTaxDE() {
        return taxDE;
    }

    private Float taxDE= 0.30f;
    Float countingTax= priceNetto + taxDE;


}
