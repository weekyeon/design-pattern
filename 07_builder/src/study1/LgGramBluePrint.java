package study1;

public class LgGramBluePrint extends BluePrint {
    //구현체

    private Computer computer;

    public LgGramBluePrint() {
        computer = new Computer("default", "default", "default");
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
    public Computer getComputer() {
        return this.computer;
    }
}
