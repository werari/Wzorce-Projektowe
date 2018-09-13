package obserwatorPogoda;

public interface Obserwator {
    void aktualizacja(Float temperatura, Float wilgotnosc, Float cisnienie);
}
