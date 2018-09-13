package obserwatorPogotowieRatunkowe;

public class FirstAmbulance implements Ambulance {
    Operator operator;

    public FirstAmbulance(Operator operator) {
        this.operator = operator;
        operator.registerAmbulance(this);
    }


    public void update (String status){
        System.out.println(driveToAccident()+ " "+status);

    }

    private String driveToAccident() {
        return "Jedziemy do wezwania";
    }


}