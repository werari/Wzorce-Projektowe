package obserwatorPogotowieRatunkowe;

public interface Operator {
    void registerAmbulance(Ambulance ambulance);
    void removeAmbulance(Ambulance ambulance);
    void alertAmbulance();

}
