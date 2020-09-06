package exercise.concrete;

import exercise.abst.ComputerFactory;
import exercise.abst.KeyboardProduct;
import exercise.abst.MouseProduct;

public class FactoryInstance {
    public static ComputerFactory getComputerFactory(String str){
        switch (str){
            case "Apple":
                return new AppleFactory();
            case "Samsung":
                return new SamsungFactory();
        }
        return null;
    }
}

/*
    어떤 환경에서 프로그램을 동작하든, 동일한 동작을 위해서는
    코딩이 OS와 상관없이 동일하게 적용되어야 함

    즉, main 메소드에서 new 연산자를 이용해 객체의 할당을 바꾸어주는 것은
    추상 팩토리 패턴을 적절하게 사용한 것이 아님

    FactoryInstance를 통해 객체를 일정하게 넘겨준다면, main 메소드는 건들 필요가 없음
    다시 말해서, concrete package와 abst package는 라이브러리 형태로 제공될 것이고
    사용자는 인터페이스(API)만 사용해서 원하는 기능을 구현하면 됨
        - ComputerFactory, KeyboardProduct, MouseProduct
 */

// AppleFactory
class AppleFactory implements ComputerFactory {
    @Override
    public MouseProduct createMouse() {
        return new AppleMouseProduct();
    }

    @Override
    public KeyboardProduct createKeyboard() {
        return new AppleKeyboardProduct();
    }
}

// AppleKeyboardProduct
class AppleKeyboardProduct implements KeyboardProduct {
    @Override
    public String getKeyboard() {
        return "Apple Keyboard Product";
    }
}

// AppleMouseProduct
class AppleMouseProduct implements MouseProduct {
    @Override
    public String getMouse() {
        return "Apple Mouse Product";
    }
}

// SamsungFactory
class SamsungFactory implements ComputerFactory {
    @Override
    public MouseProduct createMouse() {
        return new SamsungMouseProduct();
    }

    @Override
    public KeyboardProduct createKeyboard() {
        return new SamsungKeyboardProduct();
    }
}

// SamsungKeyboardProduct
class SamsungKeyboardProduct implements KeyboardProduct {
    @Override
    public String getKeyboard() {
        return "Samsung Keyboard Product";
    }
}

// SamsungMouseProduct
class SamsungMouseProduct implements MouseProduct {
    @Override
    public String getMouse() {
        return "Samsung Mouse Product";
    }
}
