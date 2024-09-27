package decorator;

public class Expresso extends Boisson{
    public Expresso() {
        description="expresso";
    }

    @Override
    public double cost() {
        return 400;
    }
}
