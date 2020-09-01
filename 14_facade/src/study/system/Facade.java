package study.system;

public class Facade {

    // 퍼사드 클래스는
    // 서브 시스템의 기능을 알고 있어야 함
    private SubSystem01 subSystem01;
    private SubSystem02 subSystem02;
    private SubSystem03 subSystem03;

    public Facade() {
        subSystem01 = new SubSystem01();
        subSystem02 = new SubSystem02();
        subSystem03 = new SubSystem03();
    }

    // 서브 시스템 프로세스 호출
    public void process(){
        subSystem01.process();
        subSystem02.process();
        subSystem03.process();
    }
}
