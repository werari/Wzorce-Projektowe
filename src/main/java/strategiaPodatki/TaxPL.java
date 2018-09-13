package strategiaPodatki;

public class TaxPL implements Tax {
    public Float taxPL= 1.23f;

    public Float countingTax(Float priceNetto) {
        Float priceBrutto = priceNetto * taxPL;
        return priceBrutto;
    }
}
