package obserwatorPogotowieRatunkowe;

import java.util.ArrayList;
import java.util.List;

public class OperatorAdam implements Operator {

    String status;
    List<Ambulance> ambulances = new ArrayList<>();


    @Override
    public void registerAmbulance(Ambulance ambulance) {
        ambulances.add(ambulance);
    }

    @Override
    public void removeAmbulance(Ambulance ambulance) {
        ambulances.remove(ambulance);
    }

    @Override
    public void alertAmbulance() {
        for (Ambulance ambulance : ambulances) {
            ambulance.update(status);
        }

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        alertAmbulance();
    }


}
