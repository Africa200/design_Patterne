package factory;

public abstract class Computer {

    public abstract String getRam();
    public abstract String getHdd();
    public abstract String getCpu();

    @Override
    public String toString() {
        return "ma configuration est : \nRAM: "+getRam()+ "\nHDD: "+getHdd()+"\nCPU: "+getCpu();
    }
}
