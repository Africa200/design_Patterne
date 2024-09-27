package decorator;

public class Lait extends BoissonDecorator{

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+ " au lait";
    }

    @Override
    public double cost() {
        return 50+boisson.cost();
    }
}
