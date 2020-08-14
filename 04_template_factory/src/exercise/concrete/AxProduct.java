package exercise.concrete;

import exercise.framework.Weapon;

public class AxProduct implements Weapon {

    @Override
    public void use() {
        System.out.println("도끼 공격");
    }
}
