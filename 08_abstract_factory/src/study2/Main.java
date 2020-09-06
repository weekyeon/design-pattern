package study2;

import study2.abst.Button;
import study2.abst.GuiFactory;
import study2.abst.Textarea;
import study2.concrete.FactoryInstance;

public class Main {

    /*
    어떤 환경에서 프로그램을 돌리든지 동일한 동작을 하기 위해서는
    이 소스가 오에스와 상관없이 동일하게 적용이 되어야 함
     */
    public static void main(String[] args) {

        // 할당 부분만 변경하면 됨
        // 근데 이렇게 쓰면 추상 팩토리 패턴을 잘 사용한 게 아님
//        GuiFactory guiFactory = new MacFactory();
//        GuiFactory guiFactory = new LinuxFactory();

        // 이렇게 팩토리 인스턴스에서 일정하게 넘겨준다면
        // 이 소스는 건들 필요가 없음
        // 콘크리트랑 앱스트랙트 패키지는 라이브러리 형태로 제공될 거고
        // GuiFactory / Btn / Textarea 인터페이스 영역만 사용해서
        // 원하는 기능 구현하면 됨
//        GuiFactory guiFactory = FactoryInstance.getGuiFactory();

        GuiFactory guiFactory = FactoryInstance.getGuiFactory();
        Button button = guiFactory.createButton();
        Textarea textarea = guiFactory.createTextarea();

        button.click();
        System.out.println(textarea.getText());

        System.out.println(System.getProperty("os.name"));
    }
}
