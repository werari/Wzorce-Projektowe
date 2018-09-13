package obserwatorPogotowieRatunkowe;

public class SecondAmbulance implements Ambulance {
    public void update (String status){
        System.out.println(driveToAccident()+ status);

    }

    private String driveToAccident() {
        return "Jedziemy do wezwania";

    }

    public SecondAmbulance(Operator operator) {
        this.operator = operator;
    }

    Operator operator;

}