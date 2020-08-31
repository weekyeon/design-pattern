package exercise1;

public class Main {

    public static void main(String[] args) {

        ComputerDirector director = new ComputerDirector();

        director.setBuilder(new GramBuilder());
        director.make();
        Computer gram = director.getComputer();
        System.out.println("Gram Computer : "+gram);

        director.setBuilder(new MacBuilder());
        director.make();
        Computer mac = director.getComputer();
        System.out.println("Mac Computer : "+mac);
    }

}
