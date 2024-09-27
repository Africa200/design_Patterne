package decorator;

public class Cafe extends Boisson{
    public Cafe() {
        description="cafe";
    }

    @Override
    public double cost() {
        return 200;
    }
}
