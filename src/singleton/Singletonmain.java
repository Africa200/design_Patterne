package singleton;

public class Singletonmain {
    public static void main(String[] args) {
//        EagerInitialisation.getInstance();
//        StaticBlocInitialisation.getInstance();
//        LazyInitialisation.getInstance();
//        LazyInitialisation.getInstance();
        for (int i = 0; i < 5; i++) {
            ThreadSafeInitialisation.getInstance();
        }
    }
}
