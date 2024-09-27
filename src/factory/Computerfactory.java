package factory;

public class Computerfactory {
    public static Computer getComputer(String type){
        switch (type){
            case "pc":
                return new PC("8Go","1 To SATA","2.5 Ghz");
            case "pcgamer":
                return new PCGamer("32Go","1 To SATA","4 Ghz");
            case "server":
                return new Server("120Go","30 To SATA","20 Ghz");
            default:
                return null;
        }

    }
}
