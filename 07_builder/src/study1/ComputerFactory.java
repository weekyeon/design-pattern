package study1;

public class ComputerFactory {
    // Computer(객체)를 BluePrint(설계도)를 바탕으로 만드는 주체

    private BluePrint bluePrint;

    public void setBluePrint(BluePrint bluePrint) {
        // 다양한 설계도를 이용하기 위해 LgGramBluePrint가 아닌 BluePrint를 인자로 받음
        this.bluePrint = bluePrint;
    }

    public void make() {
        bluePrint.setCpu();
        bluePrint.setRam();
        bluePrint.setStorage();
    }

    public Computer getComputer() {
        return bluePrint.getComputer();
    }

}
