package decorator;

public abstract class Boisson {

    protected String description;
    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
