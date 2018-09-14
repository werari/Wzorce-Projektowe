package singleton;

public class ClassicSingleton {
    private static ClassicSingleton uniqueInstance;

    private ClassicSingleton() {
    }

    public static ClassicSingleton getUniqueInstance (){
        //public static synchronized- singleton wielowątkowy

        if (uniqueInstance == null){
            uniqueInstance= new ClassicSingleton();
            System.out.println("Nowy obiekt został dodany");

        }else{
            System.out.println("Już było");
        }
        return uniqueInstance;
    }
}
