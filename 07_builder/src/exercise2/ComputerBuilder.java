package exercise2;

public class ComputerBuilder {

    private Computer computer;

    // private 생성자
    private ComputerBuilder() {
        computer = new Computer("Default", "Default", "Default");
    }

    public static ComputerBuilder start(){
        return new ComputerBuilder();
    }

    public static ComputerBuilder startWithCpu(String cpu){
        ComputerBuilder computerBuilder = new ComputerBuilder();
        computerBuilder.computer.setCpu(cpu);
        return computerBuilder;
    }

    public ComputerBuilder setCpu(String string){
        computer.setCpu(string);
        return this;
    }

    public ComputerBuilder setRam(String string){
        computer.setRam(string);
        return this;
    }

    public ComputerBuilder setStorage(String string){
        computer.setStorage(string);
        return this;
    }

    public Computer build(){
        return this.computer;
    }

}
