package exercise1;

public class MacBuilder extends AbstComputerBuilder{

    /*
        2. Computer를 Builder가 가지고 있지 않은 경우
     */
    private String cpu;
    private String ram;
    private String storage;

    @Override
    public void setCpu() {
        cpu = "i5";
    }

    @Override
    public void setRam() {
        ram = "8GB";
    }

    @Override
    public void setStorage() {
        storage = "125GB SSD";
    }

    @Override
    public Computer getCom() {
        return new Computer(cpu, ram, storage);
    }
}
