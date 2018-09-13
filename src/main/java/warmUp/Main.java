package warmUp;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Margarita();
        System.out.println(pizza.description()+ " , "+ pizza.getPrice());
        pizza = new MiesnyJez();
        System.out.println(pizza.description()+ " , "+ pizza.getPrice());
        Pasta pasta = new Carbonara();
        System.out.println(pasta.description()+ " , "+ pasta.getPrice());
    }
}
