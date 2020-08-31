package study2;

public class ComputerBuilder {

    private Computer computer;
    private ComputerBuilder(){
        computer = new Computer("default", "default", "default");
    }

    public static ComputerBuilder start() {
        // Storage 값을 넣지 않고 이렇게 하면 디폴트 값이 들어감
        return new ComputerBuilder();
    }

    // Cpu 값을 넣지 않고 이렇게 해도 디폴트 값이 들어감
    public static ComputerBuilder startWithCpu(String cpu){
        ComputerBuilder computerBuilder = new ComputerBuilder();
        computerBuilder.computer.setCpu(cpu);
        return computerBuilder;
    }

    public ComputerBuilder setCpu(String string) {
        computer.setCpu(string);
        return this;
    }

    public ComputerBuilder setRam(String string) {
        computer.setRam(string);
        return this;
    }

    public ComputerBuilder setStorage(String string) {
        computer.setStorage(string);
        return this;
    }

    public Computer build(){
        return this.computer;
    }


}
