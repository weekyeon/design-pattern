package study1;

public class Main {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        computerFactory.setBluePrint(new LgGramBluePrint());
        computerFactory.make();
        Computer computer = computerFactory.getComputer();
        System.out.println(computer);
    }
}
