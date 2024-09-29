package factory;

public class factorymain {
    public static void main(String[] args) {
        Computer computer=Computerfactory.getComputer("pc");
//        System.out.println(computer.toString());
    }
}
