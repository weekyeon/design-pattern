package study2.concrete;

import study2.abst.Button;
import study2.abst.GuiFactory;
import study2.abst.Textarea;

public class FactoryInstance {


    // Factory 인스턴스
    public static GuiFactory getGuiFactory(){

        // switch 인자를 바꿔줘야 하는 거 아님?
        // 놉. 자바에서 OS 이름 가져오는 함수 제공
//        System.getProperty("os.name");
//        switch (0){
        switch (getOsCode()){
            case 0:
                return new MacFactory();
            case 1:
                return new LinuxFactory();
        }
        return null;
    }

    private static int getOsCode(){
        if(System.getProperty("os.name").equals("Windows 10")){
            return 0;
        }
        return 1;
    }

}

// 리눅스 버튼
class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("Linux Btn Click");
    }
}

// 리눅스 TEXTAREA
class LinuxTextarea implements Textarea {
    @Override
    public String getText() {
        return "Linux Textarea";
    }
}

// 리눅스 Factory
class LinuxFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Textarea createTextarea() {
        return new LinuxTextarea();
    }
}

// 맥 btn
class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac Btn");
    }
}

// 맥 Textarea
class MacTextarea implements Textarea {
    @Override
    public String getText() {
        return "Mac Textarea";
    }
}

// 맥 Factory
class MacFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Textarea createTextarea() {
        return new MacTextarea();
    }
}
