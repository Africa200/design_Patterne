package decorator;

public class Citron extends BoissonDecorator{
    public Citron(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au citron";
    }

    @Override
    public double cost() {
        return 25+ boisson.cost();
    }
}
