package obserwatorPogoda;

import java.util.ArrayList;

public class DanePogodowe implements Podmiot {
    private ArrayList obserwatorzy;
    private Float temperatura;
    private Float wilgotnosc;
    private Float cisnienie;

    public DanePogodowe() {
        obserwatorzy = new ArrayList();
    }


    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwatorzy.add(obserwator);
    }


    public void usunObserwatora(Obserwator obserwator) {
        int i = obserwatorzy.indexOf(obserwator);
        if (i >= 0) {
            obserwatorzy.remove(i);
        }
    }


    public void powiadomObserwatorow() {
        for (Object obs : obserwatorzy) {
            Obserwator obserwator = (Obserwator) obs;
            obserwator.aktualizacja(temperatura, wilgotnosc, cisnienie);
        }
    }

    public void odczytyZmiana() {
        powiadomObserwatorow();
    }

    //testowe ustawianie odczytow (domyslnie chcielibysmy je pobierac ze stacji meteo)
    public void ustawOdczyty(Float temperatura, Float wilgotnosc, Float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        odczytyZmiana();
    }
}