package singleton;

public class StaticBlocInitialisation {
    private static StaticBlocInitialisation instance;

    private StaticBlocInitialisation() {
    }

    static {
        try{
            instance=new StaticBlocInitialisation();
        }catch (Exception e){

        }
    }

    public static StaticBlocInitialisation getInstance(){
        System.out.println("Static block initialisation");
        return instance;
    }
}
