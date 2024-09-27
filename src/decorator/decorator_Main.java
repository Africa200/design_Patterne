package decorator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class decorator_Main {
    public static void main(String[] args) {
        Boisson boisson=new Cafe();
        System.out.println("Description is "+ boisson.getDescription());
        boisson=new Citron(boisson);
        System.out.println("Description is "+ boisson.getDescription()+" and price is "+boisson.cost());
        boisson=new Lait(boisson);
        System.out.println("Description is "+ boisson.getDescription()+" and price is "+boisson.cost());
        boisson=new Sucre(boisson);
        System.out.println("Description is "+ boisson.getDescription()+" and price is "+boisson.cost());

        }
    }