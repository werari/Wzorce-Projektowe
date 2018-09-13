package strategiaPodatki;

public class TaxCZ implements Tax {

    private Float taxCZ = 1.10f;


    public Float countingTax(Float priceNetto) {
        Float priceBrutto = priceNetto * taxCZ;
        return priceBrutto;
    }
}
