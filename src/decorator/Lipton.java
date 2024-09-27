package decorator;

public class Lipton extends Boisson{

    public Lipton() {
        description="Lipton";
    }

    @Override
    public double cost() {
        return 150;
    }
}
