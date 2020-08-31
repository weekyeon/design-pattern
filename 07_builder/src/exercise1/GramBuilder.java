package exercise1;

public class GramBuilder extends AbstComputerBuilder{

    /*
        1. Computer를 Builder가 가지고 있는 경우
     */
    private Computer computer;

    public GramBuilder() {
        computer = new Computer("Default", "Default", "Default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    public void setRam() {
        computer.setRam("16GB");
    }

    @Override
    public void setStorage() {
        computer.setStorage("256GB SSD");
    }

    @Override
    public Computer getCom() {
        return this.computer;
    }
}
