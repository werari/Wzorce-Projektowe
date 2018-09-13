package obserwatorPogotowieRatunkowe;

public class Main {
    public static void main(String[] args) {
        OperatorAdam operatorAdam= new OperatorAdam();
        FirstAmbulance firstAmbulance= new FirstAmbulance(operatorAdam);
        SecondAmbulance secondAmbulance= new SecondAmbulance(operatorAdam);
        ThirdAmbulance thirdAmbulance= new ThirdAmbulance(operatorAdam);

        operatorAdam.setStatus("Car accident");
        operatorAdam.setStatus("Faint");
        operatorAdam.setStatus("Broken bone");
    }
}
