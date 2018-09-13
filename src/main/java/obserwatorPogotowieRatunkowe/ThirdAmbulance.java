package obserwatorPogotowieRatunkowe;

public class ThirdAmbulance implements Ambulance {
   public void update (String status){
       System.out.println(driveToAccident()+ status);

   }

    private String driveToAccident() {
       return "Jedziemy do wezwania";

    }

    public ThirdAmbulance(Operator operator) {
        this.operator = operator;
    }

    Operator operator;
}
