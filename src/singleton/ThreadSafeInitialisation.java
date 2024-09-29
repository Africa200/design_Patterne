package singleton;

public class ThreadSafeInitialisation {
    private static ThreadSafeInitialisation instance;

    private ThreadSafeInitialisation() {
    }
    public static synchronized ThreadSafeInitialisation getInstance(){
        if(instance==null){
            System.out.println("Thread safe new instance");
            instance=new ThreadSafeInitialisation();
        }
        System.out.println("Thread safe new instance return ");
        return instance;
    }
}
