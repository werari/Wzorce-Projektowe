package obserwatorPogoda;

import java.util.ArrayList;
import java.util.List;

public class StatystykaPogodowa implements WyswietlElement, Obserwator {

    private List<Float> temperatury = new ArrayList<>();
    private List<Float> wiglotnosci = new ArrayList<>();

    private Podmiot danePogodowe;
    private Float sredniaTemp;
    //lista

    public StatystykaPogodowa(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        this.danePogodowe.zarejestrujObserwatora(this);//rejestrujemy siebie!
    }

    //dodajemy do tablicy
    public void aktualizacja(Float temperatura, Float wilgotnosc, Float cisnienie) {
        temperatury.add(temperatura);
        wiglotnosci.add(wilgotnosc);
        sredniaTemp = licznikSredniej();
        wyswietl();
    }

    //wyswietlamy tablice  jesli mamy choć dwa
    public void wyswietl() {
        System.out.println("Statystyka tamp: " + licznikSredniej());

    }

    public Float licznikSredniej() {
        Float zmiennaSumjaca = 0f;
        if (temperatury.size() == 1) {
            System.out.println("Za mało danych");
            return temperatury.get(0);
        } else {
            for (Float temp : temperatury) {
                zmiennaSumjaca = zmiennaSumjaca + temp;
            }
            return zmiennaSumjaca / temperatury.size();
        }
    }

}