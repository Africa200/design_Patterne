package decorator;

public class Sucre extends BoissonDecorator{
    public Sucre(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cost() {
        return 25+ boisson.cost();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au sucre";
    }
}
