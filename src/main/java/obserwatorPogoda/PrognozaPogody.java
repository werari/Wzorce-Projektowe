package obserwatorPogoda;

import java.util.ArrayList;
import java.util.List;

public class PrognozaPogody implements WyswietlElement, Obserwator {

    private List<Float> temperatury = new ArrayList<>();

    private Podmiot danePogodowe;
    private String prognozowanaTemperatura;
    //lista

    public PrognozaPogody(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        this.danePogodowe.zarejestrujObserwatora(this);//rejestrujemy siebie!
    }

    //dodajemy do tablicy
    public void aktualizacja(Float temperatura, Float wilgotnosc, Float cisnienie) {
        temperatury.add(temperatura);
        prognozowanaTemperatura = liczycPrognoze();
        wyswietl();
    }

    //wyswietlamy tablice  jesli mamy choć dwa
    public void wyswietl() {
        System.out.println("Prognoza temperatury: " + prognozowanaTemperatura);

    }

    public String liczycPrognoze() {
        String zmiennaPrognozujaca;
        if (temperatury.size() < 2) {
            return ("Za mało danych do liczenia prognozy");
        } else {
            return prognozaBiezaca();
        }

    }

    private String prognozaBiezaca() {
        if (temperatury.get(temperatury.size() - 1) > temperatury.get(temperatury.size() - 2)) {
            return "Prognozujemy iż bedzie ciepło";
        } else if (temperatury.get(temperatury.size() - 1) == temperatury.get(temperatury.size() - 2)) {
            return "Prawdopodobnie temp się utrzyma";
        }else {
            return "Winter is coming";
        }
    }
}

