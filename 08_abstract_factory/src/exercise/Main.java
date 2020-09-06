package exercise;

import exercise.abst.ComputerFactory;
import exercise.abst.KeyboardProduct;
import exercise.abst.MouseProduct;
import exercise.concrete.FactoryInstance;

public class Main {
    public static void main(String[] args) {

        /*ComputerFactory computerFactory = new AppleFactory();*/
        ComputerFactory computerFactory = FactoryInstance.getComputerFactory("Samsung");
        MouseProduct mouseProduct = computerFactory.createMouse();
        KeyboardProduct keyboardProduct = computerFactory.createKeyboard();

        System.out.println(mouseProduct.getMouse());
        System.out.println(keyboardProduct.getKeyboard());

    }
}
