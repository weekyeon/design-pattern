package exercise.concrete;

import exercise.framework.Weapon;
import exercise.framework.WeaponCreator;

public class AxCreator extends WeaponCreator {
    @Override
    protected void requestWeaponList() {
        System.out.println("무기 리스트 출력");
    }

    @Override
    protected void equipWeapon() {
        System.out.println("무기 장착");
    }

    @Override
    protected Weapon attack() {
        return new AxProduct();
    }
}
