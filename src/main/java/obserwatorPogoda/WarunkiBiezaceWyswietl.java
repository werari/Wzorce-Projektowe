package obserwatorPogoda;



public class WarunkiBiezaceWyswietl implements WyswietlElement, Obserwator {
    private Float temperatura;
    private Float wilgotnosc;
    private Podmiot danePogodowe;
    //lista albo tablica

    public WarunkiBiezaceWyswietl(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        this.danePogodowe.zarejestrujObserwatora(this);//rejestrujemy siebie!
    }

//dodajemy do tablicy
    public void aktualizacja(Float temperatura, Float wilgotnosc, Float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        wyswietl();
    }

//wyswietlamy tablice  jesli mamy choć dwa
    public void wyswietl() {
        System.out.println("Warunki biezace " + temperatura +
                " stopni C oraz " + wilgotnosc + "% wilgotnosc");

    }
}