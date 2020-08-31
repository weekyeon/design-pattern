package exercise1;

public class ComputerDirector {

    private AbstComputerBuilder builder;

    // 다양한 설계도를 이용하기 위해
    // 구현체가 아닌 추상 클래스를 인자로 받음
    public void setBuilder(AbstComputerBuilder builder) {
        this.builder = builder;
    }

    public void make(){
        builder.setCpu();
        builder.setRam();
        builder.setStorage();
    }

    public Computer getComputer(){
        return builder.getCom();
    }

}
