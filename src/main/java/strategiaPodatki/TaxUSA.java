package strategiaPodatki;


public class TaxUSA implements Tax {

    public Float getTaxUSA() {
        return taxUSA;
    }
    private Float taxUSA = 1.15f;

    public Float countingTax(Float priceNetto) {
        Float priceBrutto = priceNetto * taxUSA;
        return priceBrutto;
    }
}
