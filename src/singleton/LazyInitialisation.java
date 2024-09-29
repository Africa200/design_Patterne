package singleton;

public class LazyInitialisation {
    private static LazyInitialisation instance;

    private LazyInitialisation() {
    }

    public static LazyInitialisation getInstance(){
        if (instance==null){
            System.out.println("lazy Initialisation");
            instance=new LazyInitialisation();
        }
        System.out.println("return the instance lazy");
        return instance;
    }
}
