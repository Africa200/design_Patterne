package singleton;

public class EagerInitialisation {

    private static final EagerInitialisation instance=new EagerInitialisation();
    private EagerInitialisation(){}
    public static EagerInitialisation getInstance(){
        System.out.println("EagerInstance success");
        return instance;
    }

}
